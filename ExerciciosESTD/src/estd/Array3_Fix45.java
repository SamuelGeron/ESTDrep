package estd;

public class Array3_Fix45 {
	
	/*
	 Return an array that contains exactly the same numbers as the given array, 
	 but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's,
	  but every other number may move. The array contains the same number of 4's and 5's,
	   and every 4 has a number after it that is not a 4. In this version, 5's may appear 
	   anywhere in the original array.

	fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
	fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
	fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
	 */
	
	public int[] fix45(int[] nums) {
		
		
		for(int i=0; i<nums.length; i++){
			if(nums[i] == 4){
				for(int l=i+1; l<nums.length; l++){
					if(nums[l] == 5){
						for(int k=i+2; k<nums.length; k++){
							if(k == l-1){
								nums[k] = nums[k+2];
							}else{
								nums[k] = nums[k+1];
							}
						}
					}
				}
				nums[i+1] = 5;
			}
		}
		
		return nums;
	}
	
}
