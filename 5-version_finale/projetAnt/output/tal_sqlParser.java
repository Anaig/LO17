// $ANTLR 3.5.1 /Users/ana/Documents/LO17/projetAnt/tal_sql.g 2016-06-01 14:32:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNEE", "APRES", "ARTICLE", "AUTEUR", 
		"AVANT", "BULLETIN", "CHIFFRE", "DATER", "ENTRE", "ET", "MOT", "NB", "NOMBRE", 
		"OU", "POINT", "RUBRIQUE", "SANS", "SELECT", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNEE=4;
	public static final int APRES=5;
	public static final int ARTICLE=6;
	public static final int AUTEUR=7;
	public static final int AVANT=8;
	public static final int BULLETIN=9;
	public static final int CHIFFRE=10;
	public static final int DATER=11;
	public static final int ENTRE=12;
	public static final int ET=13;
	public static final int MOT=14;
	public static final int NB=15;
	public static final int NOMBRE=16;
	public static final int OU=17;
	public static final int POINT=18;
	public static final int RUBRIQUE=19;
	public static final int SANS=20;
	public static final int SELECT=21;
	public static final int VAR=22;
	public static final int WS=23;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/ana/Documents/LO17/projetAnt/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:55:1: listerequetes returns [String sql = \"\"] : r= requete ( POINT )? ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:56:25: (r= requete ( POINT )? )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:57:3: r= requete ( POINT )?
			{
			pushFollow(FOLLOW_requete_in_listerequetes358);
			r=requete();
			state._fsp--;

			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:57:15: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:57:15: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_listerequetes360); 
					}
					break;

			}


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:64:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) ) ( MOT )? )? (d= master_date |ps= params_mot |ps= params_rubrique |ps= params_bulletin | ET | OU )+ ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre d =null;
		Arbre ps =null;

		Arbre ps_arbre; Arbre d_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:65:41: ( ( ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) ) ( MOT )? )? (d= master_date |ps= params_mot |ps= params_rubrique |ps= params_bulletin | ET | OU )+ )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:3: ( ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) ) ( MOT )? )? (d= master_date |ps= params_mot |ps= params_rubrique |ps= params_bulletin | ET | OU )+
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:3: ( ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) ) ( MOT )? )?
			int alt15=2;
			switch ( input.LA(1) ) {
				case ARTICLE:
				case AUTEUR:
				case NOMBRE:
				case SELECT:
					{
					alt15=1;
					}
					break;
				case BULLETIN:
					{
					int LA15_2 = input.LA(2);
					if ( ((LA15_2 >= ANNEE && LA15_2 <= APRES)||(LA15_2 >= AVANT && LA15_2 <= DATER)||(LA15_2 >= ET && LA15_2 <= MOT)||LA15_2==OU||LA15_2==RUBRIQUE||LA15_2==VAR) ) {
						alt15=1;
					}
					else if ( (LA15_2==SANS) ) {
						int LA15_5 = input.LA(3);
						if ( (LA15_5==VAR) ) {
							alt15=1;
						}
					}
					}
					break;
				case RUBRIQUE:
					{
					switch ( input.LA(2) ) {
						case ANNEE:
						case APRES:
						case AVANT:
						case CHIFFRE:
						case DATER:
						case MOT:
							{
							alt15=1;
							}
							break;
						case BULLETIN:
						case ET:
						case OU:
						case RUBRIQUE:
						case VAR:
							{
							alt15=1;
							}
							break;
						case SANS:
							{
							int LA15_7 = input.LA(3);
							if ( (LA15_7==VAR) ) {
								alt15=1;
							}
							}
							break;
					}
					}
					break;
			}
			switch (alt15) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:4: ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) ) ( MOT )?
					{
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:4: ( ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE ) | ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) ) )
					int alt13=2;
					switch ( input.LA(1) ) {
					case SELECT:
						{
						int LA13_1 = input.LA(2);
						if ( ((LA13_1 >= ARTICLE && LA13_1 <= AUTEUR)||LA13_1==BULLETIN||LA13_1==RUBRIQUE||LA13_1==SELECT) ) {
							alt13=1;
						}
						else if ( (LA13_1==NOMBRE) ) {
							alt13=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 13, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ARTICLE:
					case AUTEUR:
					case BULLETIN:
					case RUBRIQUE:
						{
						alt13=1;
						}
						break;
					case NOMBRE:
						{
						alt13=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:5: ( SELECT )* ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE )
							{
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:5: ( SELECT )*
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( (LA2_0==SELECT) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:66:5: SELECT
									{
									match(input,SELECT,FOLLOW_SELECT_in_requete390); 
									}
									break;

								default :
									break loop2;
								}
							}


											req_arbre.ajouteFils(new Arbre("","select distinct"));
										
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:70:3: ( ARTICLE | BULLETIN | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) | RUBRIQUE )
							int alt6=4;
							switch ( input.LA(1) ) {
							case ARTICLE:
								{
								alt6=1;
								}
								break;
							case BULLETIN:
								{
								alt6=2;
								}
								break;
							case AUTEUR:
								{
								alt6=3;
								}
								break;
							case RUBRIQUE:
								{
								alt6=4;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								throw nvae;
							}
							switch (alt6) {
								case 1 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:70:4: ARTICLE
									{
									match(input,ARTICLE,FOLLOW_ARTICLE_in_requete402); 

												req_arbre.ajouteFils(new Arbre("","fichier"));
												
									}
									break;
								case 2 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:74:6: BULLETIN
									{
									match(input,BULLETIN,FOLLOW_BULLETIN_in_requete414); 

												req_arbre.ajouteFils(new Arbre("","numero"));
												
									}
									break;
								case 3 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:5: AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE )
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete425); 
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:12: ( ( ARTICLE )? ( DATER )? | DATER ARTICLE )
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( ((LA5_0 >= ANNEE && LA5_0 <= ARTICLE)||(LA5_0 >= AVANT && LA5_0 <= CHIFFRE)||(LA5_0 >= ET && LA5_0 <= MOT)||LA5_0==OU||(LA5_0 >= RUBRIQUE && LA5_0 <= SANS)||LA5_0==VAR) ) {
										alt5=1;
									}
									else if ( (LA5_0==DATER) ) {
										int LA5_2 = input.LA(2);
										if ( ((LA5_2 >= ANNEE && LA5_2 <= APRES)||(LA5_2 >= AVANT && LA5_2 <= MOT)||LA5_2==OU||(LA5_2 >= RUBRIQUE && LA5_2 <= SANS)||LA5_2==VAR) ) {
											alt5=1;
										}
										else if ( (LA5_2==ARTICLE) ) {
											alt5=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 5, 2, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 5, 0, input);
										throw nvae;
									}

									switch (alt5) {
										case 1 :
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:13: ( ARTICLE )? ( DATER )?
											{
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:13: ( ARTICLE )?
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==ARTICLE) ) {
												alt3=1;
											}
											switch (alt3) {
												case 1 :
													// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:13: ARTICLE
													{
													match(input,ARTICLE,FOLLOW_ARTICLE_in_requete428); 
													}
													break;

											}

											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:22: ( DATER )?
											int alt4=2;
											int LA4_0 = input.LA(1);
											if ( (LA4_0==DATER) ) {
												alt4=1;
											}
											switch (alt4) {
												case 1 :
													// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:22: DATER
													{
													match(input,DATER,FOLLOW_DATER_in_requete431); 
													}
													break;

											}

											}
											break;
										case 2 :
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:78:31: DATER ARTICLE
											{
											match(input,DATER,FOLLOW_DATER_in_requete436); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete438); 
											}
											break;

									}


												req_arbre.ajouteFils(new Arbre("","email"));
												
									}
									break;
								case 4 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:82:5: RUBRIQUE
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete450); 

												req_arbre.ajouteFils(new Arbre("","rubrique"));
												
									}
									break;

							}

							}
							break;
						case 2 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:86:4: ( SELECT )? ( NOMBRE )+ ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) )
							{
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:86:4: ( SELECT )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==SELECT) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:86:4: SELECT
									{
									match(input,SELECT,FOLLOW_SELECT_in_requete461); 
									}
									break;

							}


										req_arbre.ajouteFils(new Arbre("","select"));
										
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:90:3: ( NOMBRE )+
							int cnt8=0;
							loop8:
							while (true) {
								int alt8=2;
								int LA8_0 = input.LA(1);
								if ( (LA8_0==NOMBRE) ) {
									alt8=1;
								}

								switch (alt8) {
								case 1 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:90:3: NOMBRE
									{
									match(input,NOMBRE,FOLLOW_NOMBRE_in_requete473); 
									}
									break;

								default :
									if ( cnt8 >= 1 ) break loop8;
									EarlyExitException eee = new EarlyExitException(8, input);
									throw eee;
								}
								cnt8++;
							}


										req_arbre.ajouteFils(new Arbre("","count(distinct "));
										
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:94:3: ( ARTICLE | BULLETIN | RUBRIQUE | AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE ) )
							int alt12=4;
							switch ( input.LA(1) ) {
							case ARTICLE:
								{
								alt12=1;
								}
								break;
							case BULLETIN:
								{
								alt12=2;
								}
								break;
							case RUBRIQUE:
								{
								alt12=3;
								}
								break;
							case AUTEUR:
								{
								alt12=4;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 12, 0, input);
								throw nvae;
							}
							switch (alt12) {
								case 1 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:94:4: ARTICLE
									{
									match(input,ARTICLE,FOLLOW_ARTICLE_in_requete484); 

												req_arbre.ajouteFils(new Arbre("","fichier)"));
												
									}
									break;
								case 2 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:98:6: BULLETIN
									{
									match(input,BULLETIN,FOLLOW_BULLETIN_in_requete496); 

												req_arbre.ajouteFils(new Arbre("","numero)"));
												
									}
									break;
								case 3 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:102:5: RUBRIQUE
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete507); 

												req_arbre.ajouteFils(new Arbre("","rubrique)"));
												
									}
									break;
								case 4 :
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:5: AUTEUR ( ( ARTICLE )? ( DATER )? | DATER ARTICLE )
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete518); 
									// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:13: ( ( ARTICLE )? ( DATER )? | DATER ARTICLE )
									int alt11=2;
									int LA11_0 = input.LA(1);
									if ( ((LA11_0 >= ANNEE && LA11_0 <= ARTICLE)||(LA11_0 >= AVANT && LA11_0 <= CHIFFRE)||(LA11_0 >= ET && LA11_0 <= MOT)||LA11_0==OU||(LA11_0 >= RUBRIQUE && LA11_0 <= SANS)||LA11_0==VAR) ) {
										alt11=1;
									}
									else if ( (LA11_0==DATER) ) {
										int LA11_2 = input.LA(2);
										if ( ((LA11_2 >= ANNEE && LA11_2 <= APRES)||(LA11_2 >= AVANT && LA11_2 <= MOT)||LA11_2==OU||(LA11_2 >= RUBRIQUE && LA11_2 <= SANS)||LA11_2==VAR) ) {
											alt11=1;
										}
										else if ( (LA11_2==ARTICLE) ) {
											alt11=2;
										}

										else {
											int nvaeMark = input.mark();
											try {
												input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 11, 2, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 11, 0, input);
										throw nvae;
									}

									switch (alt11) {
										case 1 :
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:14: ( ARTICLE )? ( DATER )?
											{
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:14: ( ARTICLE )?
											int alt9=2;
											int LA9_0 = input.LA(1);
											if ( (LA9_0==ARTICLE) ) {
												alt9=1;
											}
											switch (alt9) {
												case 1 :
													// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:14: ARTICLE
													{
													match(input,ARTICLE,FOLLOW_ARTICLE_in_requete522); 
													}
													break;

											}

											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:23: ( DATER )?
											int alt10=2;
											int LA10_0 = input.LA(1);
											if ( (LA10_0==DATER) ) {
												alt10=1;
											}
											switch (alt10) {
												case 1 :
													// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:23: DATER
													{
													match(input,DATER,FOLLOW_DATER_in_requete525); 
													}
													break;

											}

											}
											break;
										case 2 :
											// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:106:32: DATER ARTICLE
											{
											match(input,DATER,FOLLOW_DATER_in_requete530); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete532); 
											}
											break;

									}


												req_arbre.ajouteFils(new Arbre("","email)"));
												
									}
									break;

							}

							}
							break;

					}

					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:111:3: ( MOT )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==MOT) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:111:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_requete551); 
							}
							break;

					}


									req_arbre.ajouteFils(new Arbre("","from titretext"));
									req_arbre.ajouteFils(new Arbre("","where"));
								
					}
					break;

			}

			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:117:3: (d= master_date |ps= params_mot |ps= params_rubrique |ps= params_bulletin | ET | OU )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=7;
				switch ( input.LA(1) ) {
				case ANNEE:
				case APRES:
				case AVANT:
				case CHIFFRE:
				case DATER:
					{
					alt16=1;
					}
					break;
				case MOT:
				case SANS:
				case VAR:
					{
					alt16=2;
					}
					break;
				case RUBRIQUE:
					{
					alt16=3;
					}
					break;
				case BULLETIN:
					{
					alt16=4;
					}
					break;
				case ET:
					{
					alt16=5;
					}
					break;
				case OU:
					{
					alt16=6;
					}
					break;
				}
				switch (alt16) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:117:4: d= master_date
					{
					pushFollow(FOLLOW_master_date_in_requete572);
					d=master_date();
					state._fsp--;


									d_arbre = d;
									req_arbre.ajouteFils(d_arbre);
								
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:123:3: ps= params_mot
					{
					pushFollow(FOLLOW_params_mot_in_requete590);
					ps=params_mot();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:129:3: ps= params_rubrique
					{
					pushFollow(FOLLOW_params_rubrique_in_requete609);
					ps=params_rubrique();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 4 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:135:3: ps= params_bulletin
					{
					pushFollow(FOLLOW_params_bulletin_in_requete627);
					ps=params_bulletin();
					state._fsp--;


									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
								
					}
					break;
				case 5 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:140:6: ET
					{
					match(input,ET,FOLLOW_ET_in_requete639); 
					}
					break;
				case 6 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:141:6: OU
					{
					match(input,OU,FOLLOW_OU_in_requete646); 
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params_mot"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:148:1: params_mot returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( MOT )? par1= param_mot ( OU par2= param_mot | ET par2= param_mot )* ;
	public final Arbre params_mot() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:149:40: ( ( MOT )? par1= param_mot ( OU par2= param_mot | ET par2= param_mot )* )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:150:1: ( MOT )? par1= param_mot ( OU par2= param_mot | ET par2= param_mot )*
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:150:1: ( MOT )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==MOT) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:150:1: MOT
					{
					match(input,MOT,FOLLOW_MOT_in_params_mot684); 
					}
					break;

			}

			pushFollow(FOLLOW_param_mot_in_params_mot693);
			par1=param_mot();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:156:3: ( OU par2= param_mot | ET par2= param_mot )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ET) ) {
					int LA18_2 = input.LA(2);
					if ( (LA18_2==VAR) ) {
						alt18=2;
					}
					else if ( (LA18_2==SANS) ) {
						int LA18_5 = input.LA(3);
						if ( (LA18_5==VAR) ) {
							alt18=2;
						}

					}

				}
				else if ( (LA18_0==OU) ) {
					int LA18_3 = input.LA(2);
					if ( (LA18_3==VAR) ) {
						alt18=1;
					}
					else if ( (LA18_3==SANS) ) {
						int LA18_7 = input.LA(3);
						if ( (LA18_7==VAR) ) {
							alt18=1;
						}

					}

				}

				switch (alt18) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:156:4: OU par2= param_mot
					{
					match(input,OU,FOLLOW_OU_in_params_mot703); 
					pushFollow(FOLLOW_param_mot_in_params_mot709);
					par2=param_mot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:163:3: ET par2= param_mot
					{
					match(input,ET,FOLLOW_ET_in_params_mot723); 
					pushFollow(FOLLOW_param_mot_in_params_mot729);
					par2=param_mot();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop18;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_mot"



	// $ANTLR start "param_mot"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:172:1: param_mot returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR | SANS a= VAR );
	public final Arbre param_mot() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:172:55: (a= VAR | SANS a= VAR )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==VAR) ) {
				alt19=1;
			}
			else if ( (LA19_0==SANS) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:173:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param_mot757); 
					 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:176:2: SANS a= VAR
					{
					match(input,SANS,FOLLOW_SANS_in_param_mot767); 
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param_mot778); 
					 lepar_arbre.ajouteFils(new Arbre("mot !=", "'"+a.getText()+"'"));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_mot"



	// $ANTLR start "params_rubrique"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:183:1: params_rubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : RUBRIQUE par1= param_r ( OU par2= param_r | ET par2= param_r )* ;
	public final Arbre params_rubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:184:40: ( RUBRIQUE par1= param_r ( OU par2= param_r | ET par2= param_r )* )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:185:1: RUBRIQUE par1= param_r ( OU par2= param_r | ET par2= param_r )*
			{
			match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_params_rubrique805); 
			pushFollow(FOLLOW_param_r_in_params_rubrique813);
			par1=param_r();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:191:3: ( OU par2= param_r | ET par2= param_r )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==ET) ) {
					int LA20_2 = input.LA(2);
					if ( (LA20_2==VAR) ) {
						alt20=2;
					}
					else if ( (LA20_2==SANS) ) {
						int LA20_5 = input.LA(3);
						if ( (LA20_5==VAR) ) {
							alt20=2;
						}

					}

				}
				else if ( (LA20_0==OU) ) {
					int LA20_3 = input.LA(2);
					if ( (LA20_3==VAR) ) {
						alt20=1;
					}
					else if ( (LA20_3==SANS) ) {
						int LA20_7 = input.LA(3);
						if ( (LA20_7==VAR) ) {
							alt20=1;
						}

					}

				}

				switch (alt20) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:191:4: OU par2= param_r
					{
					match(input,OU,FOLLOW_OU_in_params_rubrique823); 
					pushFollow(FOLLOW_param_r_in_params_rubrique829);
					par2=param_r();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:198:3: ET par2= param_r
					{
					match(input,ET,FOLLOW_ET_in_params_rubrique843); 
					pushFollow(FOLLOW_param_r_in_params_rubrique849);
					par2=param_r();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop20;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_rubrique"



	// $ANTLR start "param_r"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:207:1: param_r returns [Arbre lepar_arbre = new Arbre(\"\")] : ( (a= VAR )+ | SANS (a= VAR )+ );
	public final Arbre param_r() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:207:53: ( (a= VAR )+ | SANS (a= VAR )+ )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==VAR) ) {
				alt23=1;
			}
			else if ( (LA23_0==SANS) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:208:2: (a= VAR )+
					{
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:208:4: (a= VAR )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==VAR) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:208:4: a= VAR
							{
							a=(Token)match(input,VAR,FOLLOW_VAR_in_param_r877); 
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:211:2: SANS (a= VAR )+
					{
					match(input,SANS,FOLLOW_SANS_in_param_r888); 
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:213:4: (a= VAR )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==VAR) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:213:4: a= VAR
							{
							a=(Token)match(input,VAR,FOLLOW_VAR_in_param_r899); 
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					 lepar_arbre.ajouteFils(new Arbre("rubrique !=", "'"+a.getText()+"'"));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_r"



	// $ANTLR start "params_bulletin"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:221:1: params_bulletin returns [Arbre les_pars_arbre = new Arbre(\"\")] : BULLETIN par1= param_b ( OU par2= param_b | ET par2= param_b )* ;
	public final Arbre params_bulletin() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:222:40: ( BULLETIN par1= param_b ( OU par2= param_b | ET par2= param_b )* )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:223:1: BULLETIN par1= param_b ( OU par2= param_b | ET par2= param_b )*
			{
			match(input,BULLETIN,FOLLOW_BULLETIN_in_params_bulletin930); 
			pushFollow(FOLLOW_param_b_in_params_bulletin938);
			par1=param_b();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:229:3: ( OU par2= param_b | ET par2= param_b )*
			loop24:
			while (true) {
				int alt24=3;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ET) ) {
					int LA24_2 = input.LA(2);
					if ( (LA24_2==SANS) ) {
						int LA24_4 = input.LA(3);
						if ( (LA24_4==NB) ) {
							alt24=2;
						}

					}
					else if ( (LA24_2==NB) ) {
						alt24=2;
					}

				}
				else if ( (LA24_0==OU) ) {
					int LA24_3 = input.LA(2);
					if ( (LA24_3==SANS) ) {
						int LA24_6 = input.LA(3);
						if ( (LA24_6==NB) ) {
							alt24=1;
						}

					}
					else if ( (LA24_3==NB) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:229:4: OU par2= param_b
					{
					match(input,OU,FOLLOW_OU_in_params_bulletin948); 
					pushFollow(FOLLOW_param_b_in_params_bulletin954);
					par2=param_b();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:236:3: ET par2= param_b
					{
					match(input,ET,FOLLOW_ET_in_params_bulletin968); 
					pushFollow(FOLLOW_param_b_in_params_bulletin974);
					par2=param_b();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "AND"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params_bulletin"



	// $ANTLR start "param_b"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:245:1: param_b returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= NB | SANS a= NB );
	public final Arbre param_b() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:245:53: (a= NB | SANS a= NB )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NB) ) {
				alt25=1;
			}
			else if ( (LA25_0==SANS) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:246:2: a= NB
					{
					a=(Token)match(input,NB,FOLLOW_NB_in_param_b1002); 
					 lepar_arbre.ajouteFils(new Arbre("numero =", "'"+a.getText() +"'"));
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:249:2: SANS a= NB
					{
					match(input,SANS,FOLLOW_SANS_in_param_b1012); 
					a=(Token)match(input,NB,FOLLOW_NB_in_param_b1023); 
					 lepar_arbre.ajouteFils(new Arbre("numero !=", "'"+a.getText()+"'"));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param_b"



	// $ANTLR start "master_date"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:257:1: master_date returns [Arbre req_arbre = new Arbre(\"AND date. = AND\")] : (d= date |d= dates |d= avant_date |d= apres_date );
	public final Arbre master_date() throws RecognitionException {
		Arbre req_arbre =  new Arbre("AND date. =  AND");


		Arbre d =null;

		Arbre date_arbre, dates_arbre, avant_arbre, apres_arbre;
		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:258:67: (d= date |d= dates |d= avant_date |d= apres_date )
			int alt26=4;
			switch ( input.LA(1) ) {
			case DATER:
				{
				switch ( input.LA(2) ) {
				case ENTRE:
					{
					alt26=2;
					}
					break;
				case ANNEE:
				case CHIFFRE:
					{
					alt26=1;
					}
					break;
				case AVANT:
					{
					alt26=3;
					}
					break;
				case APRES:
					{
					alt26=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ANNEE:
			case CHIFFRE:
				{
				alt26=1;
				}
				break;
			case AVANT:
				{
				alt26=3;
				}
				break;
			case APRES:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:259:4: d= date
					{
					pushFollow(FOLLOW_date_in_master_date1059);
					d=date();
					state._fsp--;


									
									date_arbre= d;
									req_arbre.ajouteFils(new Arbre("", ""));
									req_arbre.ajouteFils(date_arbre);
								
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:266:4: d= dates
					{
					pushFollow(FOLLOW_dates_in_master_date1075);
					d=dates();
					state._fsp--;


									
									dates_arbre= d;
									req_arbre.ajouteFils(new Arbre("", ""));
									req_arbre.ajouteFils(dates_arbre);
								
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:274:5: d= avant_date
					{
					pushFollow(FOLLOW_avant_date_in_master_date1096);
					d=avant_date();
					state._fsp--;


									
									avant_arbre= d;
									req_arbre.ajouteFils(new Arbre("", ""));
									req_arbre.ajouteFils(avant_arbre);
								
					}
					break;
				case 4 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:282:4: d= apres_date
					{
					pushFollow(FOLLOW_apres_date_in_master_date1116);
					d=apres_date();
					state._fsp--;


									
									apres_arbre= d;
									req_arbre.ajouteFils(new Arbre("", ""));
									req_arbre.ajouteFils(apres_arbre);
								
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "master_date"



	// $ANTLR start "date"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:292:1: date returns [Arbre date_arbre = new Arbre(\"\")] : ( DATER )? ( (j= CHIFFRE |) m= CHIFFRE |) a= ANNEE ;
	public final Arbre date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token j=null;
		Token m=null;
		Token a=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:292:48: ( ( DATER )? ( (j= CHIFFRE |) m= CHIFFRE |) a= ANNEE )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:293:1: ( DATER )? ( (j= CHIFFRE |) m= CHIFFRE |) a= ANNEE
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:293:1: ( DATER )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==DATER) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:293:1: DATER
					{
					match(input,DATER,FOLLOW_DATER_in_date1135); 
					}
					break;

			}

			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:294:2: ( (j= CHIFFRE |) m= CHIFFRE |)
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==CHIFFRE) ) {
				alt29=1;
			}
			else if ( (LA29_0==ANNEE) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:294:3: (j= CHIFFRE |) m= CHIFFRE
					{
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:294:3: (j= CHIFFRE |)
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==CHIFFRE) ) {
						int LA28_1 = input.LA(2);
						if ( (LA28_1==CHIFFRE) ) {
							alt28=1;
						}
						else if ( (LA28_1==ANNEE) ) {
							alt28=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 28, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:294:4: j= CHIFFRE
							{
							j=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_date1145); 
							date_arbre.ajouteFils(new Arbre("jour =","'"+j.getText()+"' AND"));
							}
							break;
						case 2 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:296:4: 
							{
							}
							break;

					}

					m=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_date1161); 
					date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:299:4: 
					{
					}
					break;

			}

			a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_date1177); 
			date_arbre.ajouteFils(new Arbre("annee =","'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return date_arbre;
	}
	// $ANTLR end "date"



	// $ANTLR start "dates"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:304:1: dates returns [Arbre date_arbre = new Arbre(\"\")] : DATER ENTRE (a1= ANNEE ( ET )? a2= ANNEE |m1= CHIFFRE a1= ANNEE ( ET )? m2= CHIFFRE a2= ANNEE |j1= CHIFFRE m1= CHIFFRE a1= ANNEE ( ET )? j2= CHIFFRE m2= CHIFFRE a2= ANNEE ) ;
	public final Arbre dates() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token a1=null;
		Token a2=null;
		Token m1=null;
		Token m2=null;
		Token j1=null;
		Token j2=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:304:49: ( DATER ENTRE (a1= ANNEE ( ET )? a2= ANNEE |m1= CHIFFRE a1= ANNEE ( ET )? m2= CHIFFRE a2= ANNEE |j1= CHIFFRE m1= CHIFFRE a1= ANNEE ( ET )? j2= CHIFFRE m2= CHIFFRE a2= ANNEE ) )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:305:1: DATER ENTRE (a1= ANNEE ( ET )? a2= ANNEE |m1= CHIFFRE a1= ANNEE ( ET )? m2= CHIFFRE a2= ANNEE |j1= CHIFFRE m1= CHIFFRE a1= ANNEE ( ET )? j2= CHIFFRE m2= CHIFFRE a2= ANNEE )
			{
			match(input,DATER,FOLLOW_DATER_in_dates1194); 
			match(input,ENTRE,FOLLOW_ENTRE_in_dates1198); 
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:307:2: (a1= ANNEE ( ET )? a2= ANNEE |m1= CHIFFRE a1= ANNEE ( ET )? m2= CHIFFRE a2= ANNEE |j1= CHIFFRE m1= CHIFFRE a1= ANNEE ( ET )? j2= CHIFFRE m2= CHIFFRE a2= ANNEE )
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ANNEE) ) {
				alt33=1;
			}
			else if ( (LA33_0==CHIFFRE) ) {
				int LA33_2 = input.LA(2);
				if ( (LA33_2==ANNEE) ) {
					alt33=2;
				}
				else if ( (LA33_2==CHIFFRE) ) {
					alt33=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:307:3: a1= ANNEE ( ET )? a2= ANNEE
					{
					a1=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1206); 
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:307:14: ( ET )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ET) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:307:14: ET
							{
							match(input,ET,FOLLOW_ET_in_dates1208); 
							}
							break;

					}

					a2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1216); 
					date_arbre.ajouteFils(new Arbre("annee >=","'"+a1.getText()+"'"));
							date_arbre.ajouteFils(new Arbre(" AND annee <=","'"+a2.getText()+"'"));
							
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:313:2: m1= CHIFFRE a1= ANNEE ( ET )? m2= CHIFFRE a2= ANNEE
					{
					m1=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1230); 
					a1=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1238); 
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:314:13: ( ET )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==ET) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:314:13: ET
							{
							match(input,ET,FOLLOW_ET_in_dates1240); 
							}
							break;

					}

					m2=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1248); 
					a2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1256); 
					date_arbre.ajouteFils(new Arbre("(annee >","'"+a1.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a1.getText()+"'AND"));  
							 date_arbre.ajouteFils(new Arbre("mois >=","'"+m1.getText()+"')"));
							 date_arbre.ajouteFils(new Arbre(" AND (annee <","'"+a2.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a2.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois <=","'"+m2.getText()+"')"));
							
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:325:2: j1= CHIFFRE m1= CHIFFRE a1= ANNEE ( ET )? j2= CHIFFRE m2= CHIFFRE a2= ANNEE
					{
					j1=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1271); 
					m1=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1278); 
					a1=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1286); 
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:328:2: ( ET )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==ET) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:328:2: ET
							{
							match(input,ET,FOLLOW_ET_in_dates1290); 
							}
							break;

					}

					j2=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1298); 
					m2=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_dates1305); 
					a2=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_dates1313); 
					date_arbre.ajouteFils(new Arbre("(annee >","'"+a1.getText()+"'"));
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
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return date_arbre;
	}
	// $ANTLR end "dates"



	// $ANTLR start "avant_date"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:349:1: avant_date returns [Arbre date_arbre = new Arbre(\"\")] : ( DATER )? AVANT (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE ) ;
	public final Arbre avant_date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:349:54: ( ( DATER )? AVANT (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE ) )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:350:1: ( DATER )? AVANT (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE )
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:350:1: ( DATER )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==DATER) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:350:1: DATER
					{
					match(input,DATER,FOLLOW_DATER_in_avant_date1332); 
					}
					break;

			}

			match(input,AVANT,FOLLOW_AVANT_in_avant_date1335); 
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:352:2: (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE )
			int alt35=3;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ANNEE) ) {
				alt35=1;
			}
			else if ( (LA35_0==CHIFFRE) ) {
				int LA35_2 = input.LA(2);
				if ( (LA35_2==ANNEE) ) {
					alt35=2;
				}
				else if ( (LA35_2==CHIFFRE) ) {
					alt35=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:353:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_avant_date1345); 

							date_arbre.ajouteFils(new Arbre("annee <=","'"+a.getText()+"'"));
							
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:359:2: m= CHIFFRE a= ANNEE
					{
					m=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_avant_date1361); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_avant_date1369); 

							 date_arbre.ajouteFils(new Arbre("annee <","'"+a.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois <=","'"+m.getText()+"'"));
							
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:367:2: j= CHIFFRE m= CHIFFRE a= ANNEE
					{
					j=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_avant_date1384); 
					m=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_avant_date1391); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_avant_date1398); 

							 date_arbre.ajouteFils(new Arbre("annee <","'"+a.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois <","'"+m.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));
							  date_arbre.ajouteFils(new Arbre("jour <","'"+j.getText()+"'"));	 
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return date_arbre;
	}
	// $ANTLR end "avant_date"



	// $ANTLR start "apres_date"
	// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:381:1: apres_date returns [Arbre date_arbre = new Arbre(\"\")] : ( DATER )? APRES (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE ) ;
	public final Arbre apres_date() throws RecognitionException {
		Arbre date_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:381:54: ( ( DATER )? APRES (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE ) )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:382:1: ( DATER )? APRES (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE )
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:382:1: ( DATER )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==DATER) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:382:1: DATER
					{
					match(input,DATER,FOLLOW_DATER_in_apres_date1417); 
					}
					break;

			}

			match(input,APRES,FOLLOW_APRES_in_apres_date1420); 
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:384:2: (a= ANNEE |m= CHIFFRE a= ANNEE |j= CHIFFRE m= CHIFFRE a= ANNEE )
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ANNEE) ) {
				alt37=1;
			}
			else if ( (LA37_0==CHIFFRE) ) {
				int LA37_2 = input.LA(2);
				if ( (LA37_2==ANNEE) ) {
					alt37=2;
				}
				else if ( (LA37_2==CHIFFRE) ) {
					alt37=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:385:2: a= ANNEE
					{
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_apres_date1430); 

							date_arbre.ajouteFils(new Arbre("annee >=","'"+a.getText()+"'"));
							
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:390:2: m= CHIFFRE a= ANNEE
					{
					m=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_apres_date1444); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_apres_date1452); 

							 date_arbre.ajouteFils(new Arbre("annee >","'"+a.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois >=","'"+m.getText()+"'"));
							
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:398:2: j= CHIFFRE m= CHIFFRE a= ANNEE
					{
					j=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_apres_date1467); 
					m=(Token)match(input,CHIFFRE,FOLLOW_CHIFFRE_in_apres_date1474); 
					a=(Token)match(input,ANNEE,FOLLOW_ANNEE_in_apres_date1482); 

							 date_arbre.ajouteFils(new Arbre("annee >","'"+a.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois >","'"+m.getText()+"'"));
							 date_arbre.ajouteFils(new Arbre(" OR annee =","'"+a.getText()+"' AND"));
							 date_arbre.ajouteFils(new Arbre("mois =","'"+m.getText()+"' AND"));
							  date_arbre.ajouteFils(new Arbre("jour >","'"+j.getText()+"'"));	 
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return date_arbre;
	}
	// $ANTLR end "apres_date"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes358 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_POINT_in_listerequetes360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete390 = new BitSet(new long[]{0x00000000002802C0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete402 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_BULLETIN_in_requete414 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_AUTEUR_in_requete425 = new BitSet(new long[]{0x00000000005A6F70L});
	public static final BitSet FOLLOW_ARTICLE_in_requete428 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_DATER_in_requete431 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_DATER_in_requete436 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete438 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete450 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_SELECT_in_requete461 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_NOMBRE_in_requete473 = new BitSet(new long[]{0x00000000000902C0L});
	public static final BitSet FOLLOW_ARTICLE_in_requete484 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_BULLETIN_in_requete496 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete507 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_AUTEUR_in_requete518 = new BitSet(new long[]{0x00000000005A6F70L});
	public static final BitSet FOLLOW_ARTICLE_in_requete522 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_DATER_in_requete525 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_DATER_in_requete530 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ARTICLE_in_requete532 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_MOT_in_requete551 = new BitSet(new long[]{0x00000000005A6F30L});
	public static final BitSet FOLLOW_master_date_in_requete572 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_params_mot_in_requete590 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_params_rubrique_in_requete609 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_params_bulletin_in_requete627 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_ET_in_requete639 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_OU_in_requete646 = new BitSet(new long[]{0x00000000005A6F32L});
	public static final BitSet FOLLOW_MOT_in_params_mot684 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_mot_in_params_mot693 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_OU_in_params_mot703 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_mot_in_params_mot709 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_ET_in_params_mot723 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_mot_in_params_mot729 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_VAR_in_param_mot757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SANS_in_param_mot767 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_param_mot778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_params_rubrique805 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_r_in_params_rubrique813 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_OU_in_params_rubrique823 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_r_in_params_rubrique829 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_ET_in_params_rubrique843 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_param_r_in_params_rubrique849 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_VAR_in_param_r877 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_SANS_in_param_r888 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_VAR_in_param_r899 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_BULLETIN_in_params_bulletin930 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_param_b_in_params_bulletin938 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_OU_in_params_bulletin948 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_param_b_in_params_bulletin954 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_ET_in_params_bulletin968 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_param_b_in_params_bulletin974 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_NB_in_param_b1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SANS_in_param_b1012 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NB_in_param_b1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_in_master_date1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dates_in_master_date1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_avant_date_in_master_date1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_apres_date_in_master_date1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATER_in_date1135 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_CHIFFRE_in_date1145 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_date1161 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_date1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATER_in_dates1194 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_dates1198 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_ANNEE_in_dates1206 = new BitSet(new long[]{0x0000000000002010L});
	public static final BitSet FOLLOW_ET_in_dates1208 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dates1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1230 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dates1238 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_ET_in_dates1240 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1248 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dates1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1271 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1278 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dates1286 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_ET_in_dates1290 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1298 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_dates1305 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_dates1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATER_in_avant_date1332 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_AVANT_in_avant_date1335 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_ANNEE_in_avant_date1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_avant_date1361 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_avant_date1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_avant_date1384 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_avant_date1391 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_avant_date1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATER_in_apres_date1417 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_APRES_in_apres_date1420 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_ANNEE_in_apres_date1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_apres_date1444 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_apres_date1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHIFFRE_in_apres_date1467 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_CHIFFRE_in_apres_date1474 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ANNEE_in_apres_date1482 = new BitSet(new long[]{0x0000000000000002L});
}
