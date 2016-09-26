

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class Lexique {
	protected HashMap<String, Object> lexique;
	private static double seuilLeven;
	
	static int[][] proxLetters;
	
	 BufferedReader br=null;
     String chaine;

     public Lexique(String dictionnaire){
    	 lexique = new HashMap<String, Object>();
    	 try {
    		 try {
    			 br = new BufferedReader(new FileReader(dictionnaire));
    			 while ((chaine=br.readLine())!=null) {
    				 StringTokenizer st = new StringTokenizer(chaine);
    				 String mot = (String) st.nextElement();
    				 if (st.hasMoreElements()) {
    					 lexique.put(mot, st.nextElement());
    				 }
    			 }
    		 }

    		 catch(EOFException e) {
    			 br.close();
    		 }
    	 }
    	 catch(FileNotFoundException e) {
    		 System.out.println("fichier inconnu : " + dictionnaire);
    	 } 
    	 catch(IOException e) {
    		 System.out.println("IO Exception");
    	 }
    	 if(dictionnaire.equals(Requete.dictionnaire_structure)) {
    		 seuilLeven = 0.80;
    	 } else {
    		 seuilLeven=0.25;
    	 }

     }
	
	public String getLemme(String mot) {
		mot = mot.toLowerCase();
		String lemme = (String) lexique.get(mot);
		if (lemme != null) {
			System.out.println("le mot " + mot + " existe dans le lexique ");
			return lemme;		
		} else {
			//System.out.println("le mot " + mot + " n'existe pas dans le lexique");
			List<String> liste = getLemmesCandidatsPrefixe(mot);
			if (!liste.isEmpty()) {
			return  (String) liste.get(0);
			}
			else {
				System.out.println("pas de meilleurs candidats pour " + mot + " on va devoir appeler Levenshtein");
				List<String> listeL = getLevenshtein(mot);
				if (!listeL.isEmpty()) {
				return (String) listeL.get(0);
				}
		else {
					System.out.println("aucun mot n'a été trouvé");
					return null;
				}
			}
		}
	}
	
	private List<String> getLemmesCandidatsPrefixe(String mot) {
		int seuilMin = 3;
		int seuilMax; 
		int motLength = mot.length();
		if (motLength <= 4) {
			seuilMax = 2;
		} else if (motLength <= 8) {
			seuilMax = (int) Math.round(0.5*motLength);
		} else if (motLength <= 12) {
			seuilMax = (int) Math.round(0.4*motLength);
		} else {
			seuilMax = (int) Math.round(0.3*motLength);
		}
		Set<String> cles = lexique.keySet();
		Iterator<String> it = cles.iterator();
		List<String> list = new ArrayList<String>();
		float proxMax;
		if (motLength <= 4) {
			proxMax = 50;
		} else if (motLength <= 8) {
			proxMax = 60;
		} else if (motLength <= 12) {
			proxMax = 70;
		} else {
			proxMax = 80;
		}
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) lexique.get(key);
			float proximite;
			if (mot.length() < seuilMin || key.length() < seuilMin) {
				proximite = 0;
			} else if (mot.length() - key.length() > seuilMax) {
				proximite = 0;
			} else {
				int i = 0;
				while (i < Math.min(mot.length(), key.length()) && mot.charAt(i) == key.charAt(i))  {
					i++;
					proximite = 100*(float)i/(Math.max(mot.length(), key.length()));
					if(proximite > proxMax) {
						list.clear();
						list.add(value);
						proxMax = proximite;
					} else if (proximite!= 70 && proximite == proxMax){
						list.add(value);
					}
				}
			}
		}
		
		return list;
	}
	
	private List<String> getLevenshtein(String mot) {
		Set<String> cles = lexique.keySet();
		Iterator<String> it = cles.iterator();
		List<String> list = new ArrayList<String>();
		double distMax= seuilLeven * mot.length(); //Décidé selon le dictionnaire
		while (it.hasNext()) {
			String key = (String) it.next();
			String value = (String) lexique.get(key);
			double dist = levenshtein(mot, key);
					if(dist < distMax) {
						list.clear();
						list.add(value);
						distMax = dist;
					} else if (distMax!= 5 && dist == distMax){
						list.add(value);
					}
			}	
		return list;
	}
	
	private double levenshtein(String word1, String word2){
		LetterIndex li = new LetterIndex();
		int l1 = word1.length();
		int l2 = word2.length();
		double d1, d2, d3;
		double [][] dist = new double[l1+1][l2+1];
		dist[0][0] = 0;
		//Supression
		for(int i=1; i<=l1; i++) {
			dist[i][0] = dist[i-1][0]+1 ;
		}
		//Insertion
		for(int j=1; j<=l2; j++) {
			dist[0][j] = dist[0][j-1] +1;
		}
		//Substitution
		for (int i=0; i<l1; i++) {
			for (int j=0; j<l2; j++) {
				double subst = 1;
				//On vérifie que la lettre n'a pas été intervertie avec les lettres autour
				if(word1.charAt(i) == word2.charAt(j) || j<l2-1 && word1.charAt(i) == word2.charAt(j+1) && i<l1-1 && word1.charAt(i+1) == word2.charAt(j)){
					subst = 0;
				}
				//Sinon si les lettres sont proches sur le clavier
				else if(li.isNext(word1.charAt(i), word2.charAt(j))){
					subst = 0.1;
				}
				//Subsitution + Subsitution
				d1 = dist[i][j]+ subst;
				//Subsitution + Supression
				d2 = dist[i][j+1]+1;
				//Subsitution + Insertion
				d3 = dist[i+1][j]+1;
				
				dist[i+1][j+1] = Math.min(d1, Math.min(d2, d3));
			} 
		}
	
/**Affichage de la matrice**/	
//		for (int i=0; i<=l1; i++) {
//			for (int j=0; j<=l2; j++) {
//				System.out.print(dist[i][j]+ " ");
//			}
//			System.out.println("\n");
//		}

		return dist[l1][l2];
	}
	
	
	public HashMap<String, Object> getLexique() {
		return this.lexique;
	}

}
