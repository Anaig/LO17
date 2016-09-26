
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Requete {
	public static final String dictionnaire_structure = "src/lemmes_requete.txt";
	public static final String dictionnaire_recherche = "src/filtreCorpus_P16.txt";
	public static final String dictionnaire_vouloir = "src/lemmes_vouloir.txt";


	public static void main(String[] args) {
		Lexique lexiqueRecherche = new Lexique(dictionnaire_recherche);
		Lexique lexiqueStructure = new Lexique(dictionnaire_structure);
		Lexique lexiqueVouloir = new Lexique(dictionnaire_vouloir);

		StopList stopList = new StopList();

		BufferedReader br=null;
		String chaine;
		try {
			try {
				while(true){
					br = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("saisie : ");
					chaine=br.readLine();
					System.out.println("j'ai saisi "+chaine);
					String requete= stopList.removeStopWords(chaine.toLowerCase()); //!! toLowerCase ici
					System.out.println("Requete sans stop words : " + requete);
					String resultat = "";
					boolean vouloir = true;
					StringTokenizer st = new StringTokenizer(requete);
					while (st.hasMoreElements()) {
						String mot = (String) st.nextElement();
						System.out.println("Token à lemmatiser : "+ mot);
						String lemme  = lexiqueStructure.getLemme(mot);
						System.out.println("Lemme du lexique structure : "+ lemme);
						if (lemme !=null && (lemme.equals("article") || lemme.equals("bulletin") || lemme.equals("auteur")|| lemme.equals("rubrique"))) {
							vouloir = false;
						}
						if (vouloir && lemme==null) {
							lemme = lexiqueVouloir.getLemme(mot);
							System.out.println("Lemme du lexique vouloir : "+ lemme);
						}
						if (lemme == null) {
							lemme = lexiqueRecherche.getLemme(mot);
							System.out.println("Lemme du lexique recheche : "+ lemme);
						}
						if (lemme != null) {
							resultat += lemme + " ";
						} else {
							resultat += mot + " ";
						}

					}
					System.out.println("voici la requete : " + resultat);
					TalMain3 grammaire = new TalMain3(resultat);

				} }
			catch(EOFException e) {
				br.close();
			}
		}
		catch(IOException e) {
			System.out.println("IO Exception");
		}

		//lexique.levenshtein("oslo", "snow");
	}


}
