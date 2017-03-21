package estd;

public class Even {
	
	public int countEvens(int[] nums) {
		
		int numberOfEven = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0){
				numberOfEven = numberOfEven + 1;
			}
		}
		
		return numberOfEven;
	}

}
