package estd;

public class Questao2 {
	
	public String takeOutX(String s) {
		
		String newString = "";
		boolean jumpChar = false;
		
		for(int i=0; i<s.length() ;i++){
			if( s.substring(i, i+1).equals("X") || s.substring(i, i+1).equals("x")){
				jumpChar = true;
			}else{
				jumpChar = false;
			}
			if(jumpChar == false){
				newString = newString + s.substring(i, i+1);
			}
		}
		return newString;
	}

}
