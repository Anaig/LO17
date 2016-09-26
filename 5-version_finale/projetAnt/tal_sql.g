grammar tal_sql;

SELECT : 'vouloir' 
;

NOMBRE:'nombre'
;

ARTICLE : 'article'
;

BULLETIN : 'bulletin' | 'numero'
; 

SANS :'sans'
;

ET : 'et'
;
OU : 'ou'
;

POINT : '.' | '?'
;

MOT : 'mot' | 'parler' 
;

CHIFFRE:('0'..'2')?('0'..'9')|'30'|'31'
;
AUTEUR : 'auteur'
;

ANNEE:'2''0'('0'..'1')('0'..'9')
;

DATER : 'dater'
; 
AVANT : 'avant'
;
ENTRE : 'entre'
;
APRES : 'apres'	
;
RUBRIQUE : 'rubrique'
;
WS  : (' ' |'\t' | '\r' | 'je' | 'qui' | 'dont') {skip();} | '\n' | 'un' | 'de' 
;

VAR : ('A'..'Z' | 'a'..'z' | 'é' | 'è' |'ë' |'ê' |'à'|'â'|'ä'|'î'|'ï'|'ô'|'ö'|'ù'|'û') ('a'..'z' | 'é' | 'è' |'ë' |'ê' |'à'|'â'|'ä'|'î'|'ï'|'ô'|'ö'|'ù'|'û')+
;
NB : ('0'..'9')+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT?
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre; Arbre d_arbre;} : 
		((SELECT*
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","fichier"));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","numero"));
			}
		| AUTEUR (ARTICLE? DATER? | DATER ARTICLE)
			{
			req_arbre.ajouteFils(new Arbre("","email"));
			}
		| RUBRIQUE
			{
			req_arbre.ajouteFils(new Arbre("","rubrique"));
			})
		|SELECT ?
			{
			req_arbre.ajouteFils(new Arbre("","select"));
			} 
		NOMBRE+
			{
			req_arbre.ajouteFils(new Arbre("","count(distinct "));
			}
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","fichier)"));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","numero)"));
			}
		| RUBRIQUE
			{
			req_arbre.ajouteFils(new Arbre("","rubrique)"));
			}
		| AUTEUR  (ARTICLE? DATER? | DATER ARTICLE)
			{
			req_arbre.ajouteFils(new Arbre("","email)"));
			}))
						
		MOT?
			{
				req_arbre.ajouteFils(new Arbre("","from titretext"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
			)?
		(d = master_date
			{
				d_arbre = $d.req_arbre;
				req_arbre.ajouteFils(d_arbre);
			}
			|
		ps = params_mot 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			|
		ps = params_rubrique
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			|
		ps = params_bulletin
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
			| ET
			| OU
			)+
			
			
			
;

params_mot returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
MOT?
		par1 = param_mot
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OU par2 = param_mot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
			|
		ET par2 = param_mot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param_mot returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
	|
	SANS 
		
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot !=", "'"+a.getText()+"'"));}
		
;

params_rubrique returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
RUBRIQUE
		par1 = param_r
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OU par2 = param_r
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
			|
		ET par2 = param_r
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param_r returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR+
		{ lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));}
	|
	SANS 
		
	a = VAR+
		{ lepar_arbre.ajouteFils(new Arbre("rubrique !=", "'"+a.getText()+"'"));}
		
;




params_bulletin returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
BULLETIN
		par1 = param_b
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(OU par2 = param_b
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
			|
		ET par2 = param_b
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "AND"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param_b returns [Arbre lepar_arbre = new Arbre("")] :
	a = NB
		{ lepar_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText() +"'"));}
	|
	SANS 
		
	a = NB
		{ lepar_arbre.ajouteFils(new Arbre("numero !=", "'"+a.getText()+"'"));}
		
;


master_date returns [Arbre req_arbre = new Arbre("AND date. =  AND")] 
	@init	{Arbre date_arbre, dates_arbre, avant_arbre, apres_arbre;} : 
			d = date 
			{
				
				date_arbre= $d.date_arbre;
				req_arbre.ajouteFils(new Arbre("", ""));
				req_arbre.ajouteFils(date_arbre);
			}|
			d = dates
			{
				
				dates_arbre= $d.date_arbre;
				req_arbre.ajouteFils(new Arbre("", ""));
				req_arbre.ajouteFils(dates_arbre);
			}
			 |
			 d = avant_date 
			{
				
				avant_arbre= $d.date_arbre;
				req_arbre.ajouteFils(new Arbre("", ""));
				req_arbre.ajouteFils(avant_arbre);
			}
			|
			d = apres_date 
			{
				
				apres_arbre= $d.date_arbre;
				req_arbre.ajouteFils(new Arbre("", ""));
				req_arbre.ajouteFils(apres_arbre);
			}
;


date returns [Arbre date_arbre = new Arbre("")]:
DATER?
	((j = CHIFFRE
		{date_arbre.ajouteFils(new Arbre("jour =","'"+j.getText()+"' AND"));}
		|)
	m = CHIFFRE
		{date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));}
		|)
	a = ANNEE
		{date_arbre.ajouteFils(new Arbre("annee =","'"+a.getText()+"'"));}
	
;
dates returns [Arbre date_arbre = new Arbre("")]:
DATER //a voir si besoin de le mettre en facultatif
	ENTRE
	(a1 = ANNEE ET?
	a2 = ANNEE
		{date_arbre.ajouteFils(new Arbre("annee >=","'"+a1.getText()+"'"));
		date_arbre.ajouteFils(new Arbre(" AND annee <=","'"+a2.getText()+"'"));
		}
	|
	m1 = CHIFFRE	
	a1 = ANNEE ET?
	m2 = CHIFFRE	
	a2 = ANNEE
		{date_arbre.ajouteFils(new Arbre("(annee >","'"+a1.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a1.getText()+"'AND"));  
		 date_arbre.ajouteFils(new Arbre("mois >=","'"+m1.getText()+"')"));
		 date_arbre.ajouteFils(new Arbre(" AND (annee <","'"+a2.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a2.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois <=","'"+m2.getText()+"')"));
		}
		|
	j1 = CHIFFRE
	m1 = CHIFFRE	
	a1 = ANNEE 
	ET?
	j2 = CHIFFRE
	m2 = CHIFFRE	
	a2 = ANNEE
		{date_arbre.ajouteFils(new Arbre("(annee >","'"+a1.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a1.getText()+"'AND"));  
		 date_arbre.ajouteFils(new Arbre("mois >","'"+m1.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a1.getText()+"'AND"));  
		 date_arbre.ajouteFils(new Arbre("mois =","'"+m1.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("jour >","'"+j1.getText()+"')"));
		 
		 date_arbre.ajouteFils(new Arbre(" AND (annee <","'"+a2.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a2.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois <","'"+m2.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a2.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois =","'"+m2.getText()+"' AND"));
		  date_arbre.ajouteFils(new Arbre("jour <","'"+j2.getText()+"')"));	 
		}
	)
;

avant_date returns [Arbre date_arbre = new Arbre("")]:
DATER?
AVANT
	(
	a = ANNEE
		{
		date_arbre.ajouteFils(new Arbre("annee <=","'"+a.getText()+"'"));
		}
	|
	
	m = CHIFFRE	
	a = ANNEE
		{
		 date_arbre.ajouteFils(new Arbre("annee <","'"+a.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois <=","'"+m.getText()+"'"));
		}
		|
	j = CHIFFRE
	m = CHIFFRE
	a = ANNEE
		{
		 date_arbre.ajouteFils(new Arbre("annee <","'"+a.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois <","'"+m.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));
		  date_arbre.ajouteFils(new Arbre("jour <","'"+j.getText()+"'"));	 
		}
	)
;

apres_date returns [Arbre date_arbre = new Arbre("")]:
DATER?
APRES
	(
	a = ANNEE
		{
		date_arbre.ajouteFils(new Arbre("annee >=","'"+a.getText()+"'"));
		}
	|
	m = CHIFFRE	
	a = ANNEE
		{
		 date_arbre.ajouteFils(new Arbre("annee >","'"+a.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois >=","'"+m.getText()+"'"));
		}
		|
	j = CHIFFRE
	m = CHIFFRE	
	a = ANNEE
		{
		 date_arbre.ajouteFils(new Arbre("annee >","'"+a.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois >","'"+m.getText()+"'"));
		 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
		 date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));
		  date_arbre.ajouteFils(new Arbre("jour >","'"+j.getText()+"'"));	 
		}
	)
;

		
		


