import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {

public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Texte : ");
                String s = scanner.nextLine();
                System.out.println(s);
                while (!s.equals("*")) {
                	try{
                  tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
	CommonTokenStream tokens = new CommonTokenStream(lexer);
                  tal_sqlParser parser = new tal_sqlParser(tokens);
                     String arbre = parser.listerequetes();
			System.out.println(arbre);
                  } catch(Exception e) {  }
                  System.out.print("Texte : ");
                  s = scanner.nextLine();
                }
        }


public TalMain3 (String requete) {
	System.out.println("Coucou c'est la grammaire, merci pour la requete : " + requete);
	String s = requete;
	System.out.println(s);
	try{
		tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		tal_sqlParser parser = new tal_sqlParser(tokens);
		String arbre = parser.listerequetes();
		System.out.println(arbre);
		interrogPostgresql.askBDD(postTreatment(arbre.toLowerCase()));
	} catch(Exception e) {  }
}

private String postTreatment(String requete) {
	System.out.println("before treatment" + requete);
	
	if(!requete.contains("select")) {
		requete = "SELECT distinct titretext.fichier, titretext.numero FROM titretext, date WHERE " + requete;
	}
	
	String table="";
	if (requete.contains("titretext")){
		table = "titretext";
	}

	if (requete.contains("email")) {
		requete = requete.replace("from ", "from email, ");
		//if (table.isEmpty()) {  //cas où date seule, sans mot recherché
		//	requete = requete.replace("and email. =  and ", "from date where");
		//} else
			requete = requete.replace("where", "where email.fichier = " + table + ".fichier and");
			//requete = requete.replaceFirst("fichier", table + ".fichier");
		if (requete.contains("numero")) {
			requete = requete.replace("numero", table + ".numero");
		}
	}

	if (requete.contains("date.")) {
		requete = requete.replace("from ", "from date, ");
		if (table.isEmpty()) {  //cas où date seule, sans mot recherché
			requete = requete.replace("and date. =  and ", "from date where");
		} else if (requete.contains("fichier")) {
			requete = requete.replace("date. =", "date.fichier = "+ table +".fichier"  );
			requete = requete.replaceFirst(" fichier", table + ".fichier");
		} else if (requete.contains("numero")) {
			requete = requete.replace("date. =", "date.numero = "+ table +".numero"  );
			requete = requete.replaceFirst("numero", table + ".numero");
		}
	}

	if (requete.contains("(    ( mot = 'titre'  ) )")) {
		requete = requete.replace("(    ( mot = 'titre'  ) )", "");
		requete = requete.replaceAll("titretext", "titre");
	}

	if (requete.contains("where and")) {
		requete = requete.replace("where and", "where");
	}
	requete = requete.replace("WHERE    ( and", "WHERE    (");
	if (requete.contains("and and")) {
		requete = requete.replace("and and", "and");
	}
	//Rubriques
	if (requete.contains("and and")) {
		requete = requete.replace("and and", "and");
	}
	requete = requete.replace("( rubrique = 'innovation'  )", "((rubrique = 'actualités innovation') OR (rubrique = 'actualité-innovation') OR (rubrique = 'actualité innovation') OR (rubrique = 'actualité innovations'))");
	requete = requete.replace("( rubrique = 'enseignement'  )", "(( rubrique = 'horizon enseignement'  ) OR (rubrique = 'horizons enseignement') OR ( rubrique = 'horizons formation enseignement'  ))");
	requete = requete.replace("( rubrique = 'pôle'  )", "( rubrique = 'du côté des pôles'  )");
	requete = requete.replace("rubrique = 'lire' ", "rubrique = 'a lire' ");
	requete = requete.replace("( rubrique = 'région'  )", "( rubrique = 'au coeur des régions'  )");
	requete = requete.replace("( rubrique = 'laboratoire'  )'", "( rubrique = 'en direct des laboratoires'  )");
	requete = requete.replace("( rubrique = 'labos'  )", "( rubrique = 'en direct des labos'  )");
	requete = requete.replace("( rubrique = 'formation'  )", "( rubrique = 'horizon formation'  )");
	
	requete = requete.replace(")   (", ") and (");
	requete = requete.replace(")      (", ") and (");



	System.out.println("post treatment" + requete);
	
	return requete;
}
}

