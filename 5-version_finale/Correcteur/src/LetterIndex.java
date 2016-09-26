

public class LetterIndex {
	
	static int[][] proxLetters;
	
	public LetterIndex(){
		proxLetters = new int[26][26];
		initialize();
	}
	
	public boolean isNext(char x, char y){
		if (getIdx(x)==-1 || getIdx(y)==-1) {
			return checkAccent(x, y);
		}
		else if(proxLetters[getIdx(x)][getIdx(y)] == 1)
			return true;
		else return false;
	}
	
	public static int getIdx(char lettre){
		if ((int)lettre < 97 || (int)lettre > 122) {
			return -1;
		}
		else return (int)lettre - (int)'a';
	}
	
	public void initialize() {
		proxLetters[getIdx('a')][getIdx('z')] = 1;
		proxLetters[getIdx('a')][getIdx('q')] = 1;
		proxLetters[getIdx('a')][getIdx('s')] = 1;
		
		proxLetters[getIdx('z')][getIdx('a')] = 1;
		proxLetters[getIdx('z')][getIdx('q')] = 1;
		proxLetters[getIdx('z')][getIdx('s')] = 1;
		proxLetters[getIdx('z')][getIdx('e')] = 1;
		
		proxLetters[getIdx('e')][getIdx('z')] = 1;
		proxLetters[getIdx('e')][getIdx('s')] = 1;
		proxLetters[getIdx('e')][getIdx('d')] = 1;
		proxLetters[getIdx('e')][getIdx('r')] = 1;
		
		proxLetters[getIdx('r')][getIdx('e')] = 1;
		proxLetters[getIdx('r')][getIdx('d')] = 1;
		proxLetters[getIdx('r')][getIdx('f')] = 1;
		proxLetters[getIdx('r')][getIdx('t')] = 1;
		
		proxLetters[getIdx('t')][getIdx('r')] = 1;
		proxLetters[getIdx('t')][getIdx('f')] = 1;
		proxLetters[getIdx('t')][getIdx('g')] = 1;
		proxLetters[getIdx('t')][getIdx('y')] = 1;
		
		proxLetters[getIdx('y')][getIdx('t')] = 1;
		proxLetters[getIdx('y')][getIdx('g')] = 1;
		proxLetters[getIdx('y')][getIdx('h')] = 1;
		proxLetters[getIdx('y')][getIdx('u')] = 1;
		
		proxLetters[getIdx('u')][getIdx('y')] = 1;
		proxLetters[getIdx('u')][getIdx('h')] = 1;
		proxLetters[getIdx('u')][getIdx('j')] = 1;
		proxLetters[getIdx('u')][getIdx('i')] = 1;
		
		proxLetters[getIdx('i')][getIdx('u')] = 1;
		proxLetters[getIdx('i')][getIdx('j')] = 1;
		proxLetters[getIdx('i')][getIdx('k')] = 1;
		proxLetters[getIdx('i')][getIdx('o')] = 1;
		
		proxLetters[getIdx('o')][getIdx('i')] = 1;
		proxLetters[getIdx('o')][getIdx('k')] = 1;
		proxLetters[getIdx('o')][getIdx('l')] = 1;
		proxLetters[getIdx('o')][getIdx('p')] = 1;
		
		proxLetters[getIdx('p')][getIdx('o')] = 1;
		proxLetters[getIdx('p')][getIdx('l')] = 1;
		proxLetters[getIdx('p')][getIdx('m')] = 1;
		
		proxLetters[getIdx('q')][getIdx('a')] = 1;
		proxLetters[getIdx('q')][getIdx('s')] = 1;
		proxLetters[getIdx('q')][getIdx('w')] = 1;
		
		proxLetters[getIdx('s')][getIdx('a')] = 1;
		proxLetters[getIdx('s')][getIdx('z')] = 1;
		proxLetters[getIdx('s')][getIdx('e')] = 1;
		proxLetters[getIdx('s')][getIdx('d')] = 1;
		proxLetters[getIdx('s')][getIdx('x')] = 1;
		proxLetters[getIdx('s')][getIdx('w')] = 1;
		proxLetters[getIdx('s')][getIdx('q')] = 1;
		
		proxLetters[getIdx('d')][getIdx('e')] = 1;
		proxLetters[getIdx('d')][getIdx('r')] = 1;
		proxLetters[getIdx('d')][getIdx('f')] = 1;
		proxLetters[getIdx('d')][getIdx('c')] = 1;
		proxLetters[getIdx('d')][getIdx('x')] = 1;
		proxLetters[getIdx('d')][getIdx('s')] = 1;
		
		proxLetters[getIdx('f')][getIdx('r')] = 1;
		proxLetters[getIdx('f')][getIdx('t')] = 1;
		proxLetters[getIdx('f')][getIdx('g')] = 1;
		proxLetters[getIdx('f')][getIdx('v')] = 1;
		proxLetters[getIdx('f')][getIdx('c')] = 1;
		proxLetters[getIdx('f')][getIdx('d')] = 1;
		
		proxLetters[getIdx('g')][getIdx('t')] = 1;
		proxLetters[getIdx('g')][getIdx('y')] = 1;
		proxLetters[getIdx('g')][getIdx('h')] = 1;
		proxLetters[getIdx('g')][getIdx('b')] = 1;
		proxLetters[getIdx('g')][getIdx('v')] = 1;
		proxLetters[getIdx('g')][getIdx('f')] = 1;
		
		proxLetters[getIdx('h')][getIdx('y')] = 1;
		proxLetters[getIdx('h')][getIdx('u')] = 1;
		proxLetters[getIdx('h')][getIdx('j')] = 1;
		proxLetters[getIdx('h')][getIdx('n')] = 1;
		proxLetters[getIdx('h')][getIdx('b')] = 1;
		proxLetters[getIdx('h')][getIdx('g')] = 1;
		
		proxLetters[getIdx('j')][getIdx('u')] = 1;
		proxLetters[getIdx('j')][getIdx('i')] = 1;
		proxLetters[getIdx('j')][getIdx('k')] = 1;
		proxLetters[getIdx('j')][getIdx('n')] = 1;
		proxLetters[getIdx('j')][getIdx('h')] = 1;
		
		proxLetters[getIdx('k')][getIdx('i')] = 1;
		proxLetters[getIdx('k')][getIdx('o')] = 1;
		proxLetters[getIdx('k')][getIdx('l')] = 1;
		proxLetters[getIdx('k')][getIdx('j')] = 1;
		
		proxLetters[getIdx('l')][getIdx('o')] = 1;
		proxLetters[getIdx('l')][getIdx('p')] = 1;
		proxLetters[getIdx('l')][getIdx('m')] = 1;
		proxLetters[getIdx('l')][getIdx('k')] = 1;
		
		proxLetters[getIdx('m')][getIdx('l')] = 1;
		proxLetters[getIdx('m')][getIdx('p')] = 1;
		
		proxLetters[getIdx('w')][getIdx('q')] = 1;
		proxLetters[getIdx('w')][getIdx('s')] = 1;
		proxLetters[getIdx('w')][getIdx('x')] = 1;
		
		proxLetters[getIdx('x')][getIdx('w')] = 1;
		proxLetters[getIdx('x')][getIdx('s')] = 1;
		proxLetters[getIdx('x')][getIdx('d')] = 1;
		proxLetters[getIdx('x')][getIdx('c')] = 1;
		
		proxLetters[getIdx('c')][getIdx('x')] = 1;
		proxLetters[getIdx('c')][getIdx('d')] = 1;
		proxLetters[getIdx('c')][getIdx('f')] = 1;
		proxLetters[getIdx('c')][getIdx('v')] = 1;
		
		proxLetters[getIdx('v')][getIdx('c')] = 1;
		proxLetters[getIdx('v')][getIdx('f')] = 1;
		proxLetters[getIdx('v')][getIdx('g')] = 1;
		proxLetters[getIdx('v')][getIdx('b')] = 1;
		
		proxLetters[getIdx('b')][getIdx('v')] = 1;
		proxLetters[getIdx('b')][getIdx('g')] = 1;
		proxLetters[getIdx('b')][getIdx('h')] = 1;
		proxLetters[getIdx('b')][getIdx('n')] = 1;
		
		proxLetters[getIdx('n')][getIdx('b')] = 1;
		proxLetters[getIdx('n')][getIdx('h')] = 1;
		proxLetters[getIdx('n')][getIdx('j')] = 1;
	}
	
	public boolean checkAccent(char x, char y) {
		if (x=='a') {
			if(y=='à' || y=='â' || y=='ä') 
				return true;
			else return false;
		} else if (x=='e') {
			if(y=='é' || y=='è' || y=='ë' || y=='ê')
				return true;
			else return false;
		} else if (x=='i') {
			if(y=='ï' || y=='î') 
				return true;
			else return false;
		} else if(x=='o'){
			if(y=='ö' || y=='ô'){
				return true;
			} else return false;
		}
		else if(x=='u'){
			if(y=='ü' || y=='û' ||y=='ù'){
				return true;
			} else return false;
		} else return false;
	}
}
