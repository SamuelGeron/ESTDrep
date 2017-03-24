package estd;

public class Questao4 {
	
	public boolean firstOrLast5(int[] n) {
		
		boolean firstLast = false;
		
		if( n[0] == 5 || n[n.length -1] == 5){
			firstLast = true;
		}
		
		return firstLast;
	}
	
}
