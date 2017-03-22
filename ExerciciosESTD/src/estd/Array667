public class Array667 {

	/*Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

			array667([6, 6, 2]) → 1
			array667([6, 6, 2, 6]) → 1
			array667([6, 7, 2, 6]) → 1*/
	
	
	public int array667(int[] nums) {
		
		int result = 0;
		boolean verifyAgain = false;
		
		for ( int i =0; i<nums.length; i++) {
			if(nums[i] == 6){
				if( verifyAgain == true ){
					result= result +1;
				}
				verifyAgain = true;
			}else if(nums[i] == 7 && verifyAgain == true ){
				result= result +1;
				verifyAgain = false;
			}else{
				verifyAgain = false;
			}
		}
		
		return result;
	}


}
