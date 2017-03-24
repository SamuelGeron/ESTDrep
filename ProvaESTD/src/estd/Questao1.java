package estd;

public class Questao1 {
	
	public boolean sequence22(int[] n) {
		
		boolean sequence = false;
		int numSequence = 0;
		
		for (int i=0; i<n.length; i++) {
			if (n[i] == 2) {
				numSequence = numSequence+1;
			}else{
				numSequence = 0;
			}
			if (numSequence == 2){
				sequence = true;
			}
		}
		
		return sequence;
	}
	
}
