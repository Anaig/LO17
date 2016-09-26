
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class StopList {
	protected List<String> stoplist;
	static final String dictionnaire = "src/stoplist_requete";
	
	 BufferedReader br=null;
     String chaine;

	public StopList(){
		stoplist = new ArrayList<String>();
	     try {
	          try {
	              br = new BufferedReader(new FileReader(dictionnaire));
	               while ((chaine=br.readLine())!=null) {     
	              				stoplist.add(chaine);
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
	}
	
	public String removeStopWords(String requete) {
		String retour = "";
		requete = requete.replaceAll("’", " ");
		requete = requete.replaceAll("'", " ");
		requete = requete.replaceAll("\"", "");
		StringTokenizer st = new StringTokenizer(requete); 
			while (st.hasMoreElements()) {
				String mot = (String) st.nextElement();
				if (!isStopWord(mot)) {
					retour += mot + " ";
				}
			}
		
		return retour;
	}
	
	private boolean isStopWord(String mot) {
		if (stoplist.contains(mot)) {
			return true;}
		else {
			return false;
		}
	}
	

}
