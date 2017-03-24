package estd;

public class Questao3 {
	
	public boolean sum2equals8(int[] n) {
		
		boolean equals8 = false;
		int sum2 = 0;
		
		for (int i=0; i<n.length; i++) {
			if( n[i] == 2){
				sum2 = sum2 + n[i];
			}
		}
		
		if( sum2 == 8 ){
			equals8 = true;
		}
		
		return equals8;
	}
	
}
