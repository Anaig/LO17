// $ANTLR 3.5.1 /Users/ana/Documents/LO17/projetAnt/tal_sql.g 2016-06-01 14:32:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/ana/Documents/LO17/projetAnt/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:3:8: ( 'vouloir' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:3:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "NOMBRE"
	public final void mNOMBRE() throws RecognitionException {
		try {
			int _type = NOMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:6:7: ( 'nombre' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:6:8: 'nombre'
			{
			match("nombre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOMBRE"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:9:9: ( 'article' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:9:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:12:10: ( 'bulletin' | 'numero' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='b') ) {
				alt1=1;
			}
			else if ( (LA1_0=='n') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:12:12: 'bulletin'
					{
					match("bulletin"); 

					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:12:25: 'numero'
					{
					match("numero"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "SANS"
	public final void mSANS() throws RecognitionException {
		try {
			int _type = SANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:15:6: ( 'sans' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:15:7: 'sans'
			{
			match("sans"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SANS"

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:18:4: ( 'et' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:18:6: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:20:4: ( 'ou' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:20:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:23:7: ( '.' | '?' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:26:5: ( 'mot' | 'parler' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='m') ) {
				alt2=1;
			}
			else if ( (LA2_0=='p') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:26:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:26:15: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "CHIFFRE"
	public final void mCHIFFRE() throws RecognitionException {
		try {
			int _type = CHIFFRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:29:8: ( ( '0' .. '2' )? ( '0' .. '9' ) | '30' | '31' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '2')||(LA4_0 >= '4' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			else if ( (LA4_0=='3') ) {
				switch ( input.LA(2) ) {
				case '0':
					{
					alt4=2;
					}
					break;
				case '1':
					{
					alt4=3;
					}
					break;
				default:
					alt4=1;
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:29:9: ( '0' .. '2' )? ( '0' .. '9' )
					{
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:29:9: ( '0' .. '2' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= '0' && LA3_0 <= '2')) ) {
						int LA3_1 = input.LA(2);
						if ( ((LA3_1 >= '0' && LA3_1 <= '9')) ) {
							alt3=1;
						}
					}
					switch (alt3) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:29:31: '30'
					{
					match("30"); 

					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:29:36: '31'
					{
					match("31"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHIFFRE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:31:8: ( 'auteur' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:31:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "ANNEE"
	public final void mANNEE() throws RecognitionException {
		try {
			int _type = ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:34:6: ( '2' '0' ( '0' .. '1' ) ( '0' .. '9' ) )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:34:7: '2' '0' ( '0' .. '1' ) ( '0' .. '9' )
			{
			match('2'); 
			match('0'); 
			if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNEE"

	// $ANTLR start "DATER"
	public final void mDATER() throws RecognitionException {
		try {
			int _type = DATER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:37:7: ( 'dater' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:37:9: 'dater'
			{
			match("dater"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATER"

	// $ANTLR start "AVANT"
	public final void mAVANT() throws RecognitionException {
		try {
			int _type = AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:39:7: ( 'avant' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:39:9: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVANT"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:41:7: ( 'entre' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:41:9: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "APRES"
	public final void mAPRES() throws RecognitionException {
		try {
			int _type = APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:43:7: ( 'apres' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:43:9: 'apres'
			{
			match("apres"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRES"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:45:10: ( 'rubrique' )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:45:12: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' | 'un' | 'de' )
			int alt6=4;
			switch ( input.LA(1) ) {
			case '\t':
			case '\r':
			case ' ':
			case 'j':
			case 'q':
				{
				alt6=1;
				}
				break;
			case 'd':
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2=='o') ) {
					alt6=1;
				}
				else if ( (LA6_2=='e') ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '\n':
				{
				alt6=2;
				}
				break;
			case 'u':
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt5=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt5=1;
						}
						break;
					case '\t':
						{
						alt5=2;
						}
						break;
					case '\r':
						{
						alt5=3;
						}
						break;
					case 'j':
						{
						alt5=4;
						}
						break;
					case 'q':
						{
						alt5=5;
						}
						break;
					case 'd':
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:62: '\\n'
					{
					match('\n'); 
					}
					break;
				case 3 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:69: 'un'
					{
					match("un"); 

					}
					break;
				case 4 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:47:76: 'de'
					{
					match("de"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:50:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | 'é' | 'è' | 'ë' | 'ê' | 'à' | 'â' | 'ä' | 'î' | 'ï' | 'ô' | 'ö' | 'ù' | 'û' ) ( 'a' .. 'z' | 'é' | 'è' | 'ë' | 'ê' | 'à' | 'â' | 'ä' | 'î' | 'ï' | 'ô' | 'ö' | 'ù' | 'û' )+ )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:50:7: ( 'A' .. 'Z' | 'a' .. 'z' | 'é' | 'è' | 'ë' | 'ê' | 'à' | 'â' | 'ä' | 'î' | 'ï' | 'ô' | 'ö' | 'ù' | 'û' ) ( 'a' .. 'z' | 'é' | 'è' | 'ë' | 'ê' | 'à' | 'â' | 'ä' | 'î' | 'ï' | 'ô' | 'ö' | 'ù' | 'û' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E0'||input.LA(1)=='\u00E2'||input.LA(1)=='\u00E4'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00EB')||(input.LA(1) >= '\u00EE' && input.LA(1) <= '\u00EF')||input.LA(1)=='\u00F4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00F9'||input.LA(1)=='\u00FB' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:50:88: ( 'a' .. 'z' | 'é' | 'è' | 'ë' | 'ê' | 'à' | 'â' | 'ä' | 'î' | 'ï' | 'ô' | 'ö' | 'ù' | 'û' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'a' && LA7_0 <= 'z')||LA7_0=='\u00E0'||LA7_0=='\u00E2'||LA7_0=='\u00E4'||(LA7_0 >= '\u00E8' && LA7_0 <= '\u00EB')||(LA7_0 >= '\u00EE' && LA7_0 <= '\u00EF')||LA7_0=='\u00F4'||LA7_0=='\u00F6'||LA7_0=='\u00F9'||LA7_0=='\u00FB') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E0'||input.LA(1)=='\u00E2'||input.LA(1)=='\u00E4'||(input.LA(1) >= '\u00E8' && input.LA(1) <= '\u00EB')||(input.LA(1) >= '\u00EE' && input.LA(1) <= '\u00EF')||input.LA(1)=='\u00F4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00F9'||input.LA(1)=='\u00FB' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "NB"
	public final void mNB() throws RecognitionException {
		try {
			int _type = NB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:52:4: ( ( '0' .. '9' )+ )
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:52:6: ( '0' .. '9' )+
			{
			// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:52:6: ( '0' .. '9' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NB"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:8: ( SELECT | NOMBRE | ARTICLE | BULLETIN | SANS | ET | OU | POINT | MOT | CHIFFRE | AUTEUR | ANNEE | DATER | AVANT | ENTRE | APRES | RUBRIQUE | WS | VAR | NB )
		int alt9=20;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:17: NOMBRE
				{
				mNOMBRE(); 

				}
				break;
			case 3 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:24: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:32: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 5 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:41: SANS
				{
				mSANS(); 

				}
				break;
			case 6 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:46: ET
				{
				mET(); 

				}
				break;
			case 7 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:49: OU
				{
				mOU(); 

				}
				break;
			case 8 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:52: POINT
				{
				mPOINT(); 

				}
				break;
			case 9 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:58: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:62: CHIFFRE
				{
				mCHIFFRE(); 

				}
				break;
			case 11 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:70: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 12 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:77: ANNEE
				{
				mANNEE(); 

				}
				break;
			case 13 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:83: DATER
				{
				mDATER(); 

				}
				break;
			case 14 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:89: AVANT
				{
				mAVANT(); 

				}
				break;
			case 15 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:95: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 16 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:101: APRES
				{
				mAPRES(); 

				}
				break;
			case 17 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:107: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 18 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:116: WS
				{
				mWS(); 

				}
				break;
			case 19 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:119: VAR
				{
				mVAR(); 

				}
				break;
			case 20 :
				// /Users/ana/Documents/LO17/projetAnt/tal_sql.g:1:123: NB
				{
				mNB(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\13\uffff\4\45\7\uffff\11\25\1\71\1\25\1\73\2\25\1\45\1\uffff\2\45\1\uffff"+
		"\2\25\1\21\1\25\1\21\1\25\1\21\11\25\1\uffff\1\25\1\uffff\1\115\1\25\1"+
		"\50\3\25\1\21\10\25\1\133\1\25\1\uffff\1\25\1\136\1\25\1\21\6\25\1\146"+
		"\1\147\1\25\1\uffff\1\151\1\25\1\uffff\1\153\2\25\1\156\1\157\1\25\1\161"+
		"\2\uffff\1\25\1\uffff\1\115\1\uffff\1\25\1\164\2\uffff\1\165\1\uffff\2"+
		"\25\2\uffff\1\157\1\170\1\uffff";
	static final String DFA9_eofS =
		"\171\uffff";
	static final String DFA9_minS =
		"\1\11\7\141\1\uffff\2\141\4\60\2\141\1\uffff\3\141\1\uffff\1\165\2\155"+
		"\2\164\1\141\1\162\1\154\1\156\1\141\1\164\1\141\1\164\1\162\1\60\1\uffff"+
		"\2\60\1\uffff\1\164\1\156\1\141\1\142\1\141\1\151\1\141\1\154\1\142\1"+
		"\145\1\151\1\145\1\156\1\145\1\154\1\163\1\uffff\1\162\1\uffff\1\141\1"+
		"\154\1\60\1\145\1\164\1\162\1\141\1\157\2\162\1\143\1\165\1\164\1\163"+
		"\1\145\1\141\1\145\1\uffff\1\145\1\60\1\162\1\141\2\151\1\145\1\157\1"+
		"\154\1\162\2\141\1\164\1\uffff\1\141\1\162\1\uffff\1\141\1\161\1\162\2"+
		"\141\1\145\1\141\2\uffff\1\151\1\uffff\1\141\1\uffff\1\165\1\141\2\uffff"+
		"\1\141\1\uffff\1\156\1\145\2\uffff\2\141\1\uffff";
	static final String DFA9_maxS =
		"\10\u00fb\1\uffff\2\u00fb\4\71\2\u00fb\1\uffff\3\u00fb\1\uffff\1\165\2"+
		"\155\2\164\1\141\1\162\1\154\1\156\1\u00fb\1\164\1\u00fb\1\164\1\162\1"+
		"\71\1\uffff\2\71\1\uffff\1\164\1\156\1\u00fb\1\142\1\u00fb\1\151\1\u00fb"+
		"\1\154\1\142\1\145\1\151\1\145\1\156\1\145\1\154\1\163\1\uffff\1\162\1"+
		"\uffff\1\u00fb\1\154\1\71\1\145\1\164\1\162\1\u00fb\1\157\2\162\1\143"+
		"\1\165\1\164\1\163\1\145\1\u00fb\1\145\1\uffff\1\145\1\71\1\162\1\u00fb"+
		"\2\151\1\145\1\157\1\154\1\162\2\u00fb\1\164\1\uffff\1\u00fb\1\162\1\uffff"+
		"\1\u00fb\1\161\1\162\2\u00fb\1\145\1\u00fb\2\uffff\1\151\1\uffff\1\u00fb"+
		"\1\uffff\1\165\1\u00fb\2\uffff\1\u00fb\1\uffff\1\156\1\145\2\uffff\2\u00fb"+
		"\1\uffff";
	static final String DFA9_acceptS =
		"\10\uffff\1\10\10\uffff\1\22\3\uffff\1\23\17\uffff\1\12\2\uffff\1\24\20"+
		"\uffff\1\6\1\uffff\1\7\21\uffff\1\11\15\uffff\1\5\2\uffff\1\14\7\uffff"+
		"\1\16\1\20\1\uffff\1\17\1\uffff\1\15\2\uffff\1\2\1\4\1\uffff\1\13\2\uffff"+
		"\1\1\1\3\2\uffff\1\21";
	static final String DFA9_specialS =
		"\171\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\21\2\uffff\1\21\22\uffff\1\21\15\uffff\1\10\1\uffff\2\16\1\13\1\14"+
			"\6\15\5\uffff\1\10\1\uffff\32\25\6\uffff\1\3\1\4\1\25\1\17\1\6\4\25\1"+
			"\22\2\25\1\11\1\2\1\7\1\12\1\23\1\20\1\5\1\25\1\24\1\1\4\25\145\uffff"+
			"\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff\2\25\4\uffff\1\25"+
			"\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\16\25\1\26\13\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\16\25\1\27\5\25\1\30\5\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25"+
			"\3\uffff\4\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff"+
			"\1\25",
			"\17\25\1\34\1\25\1\31\2\25\1\32\1\33\4\25\145\uffff\1\25\1\uffff\1\25"+
			"\1\uffff\1\25\3\uffff\4\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff"+
			"\1\25\1\uffff\1\25",
			"\24\25\1\35\5\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\36\31\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2"+
			"\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\15\25\1\40\5\25\1\37\6\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25"+
			"\3\uffff\4\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff"+
			"\1\25",
			"\24\25\1\41\5\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"\16\25\1\42\13\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\43\31\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2"+
			"\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\44\11\15",
			"\1\46\1\47\10\50",
			"\12\50",
			"\12\15",
			"\1\51\3\25\1\53\11\25\1\52\13\25\145\uffff\1\25\1\uffff\1\25\1\uffff"+
			"\1\25\3\uffff\4\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25"+
			"\1\uffff\1\25",
			"\24\25\1\54\5\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"\4\25\1\55\25\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\24\25\1\56\5\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\15\25\1\57\14\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4"+
			"\25\2\uffff\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\72",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\74",
			"\1\75",
			"\2\76\10\50",
			"",
			"\12\50",
			"\12\50",
			"",
			"\1\77",
			"\1\100",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\101",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\102",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"\1\114",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\116",
			"\12\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\134",
			"",
			"\1\135",
			"\12\50",
			"\1\137",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\150",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\152",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\154",
			"\1\155",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\1\160",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"",
			"\1\162",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"\1\163",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"",
			"\1\166",
			"\1\167",
			"",
			"",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			"\32\25\145\uffff\1\25\1\uffff\1\25\1\uffff\1\25\3\uffff\4\25\2\uffff"+
			"\2\25\4\uffff\1\25\1\uffff\1\25\2\uffff\1\25\1\uffff\1\25",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | NOMBRE | ARTICLE | BULLETIN | SANS | ET | OU | POINT | MOT | CHIFFRE | AUTEUR | ANNEE | DATER | AVANT | ENTRE | APRES | RUBRIQUE | WS | VAR | NB );";
		}
	}

}
