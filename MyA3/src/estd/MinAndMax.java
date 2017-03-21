package estd;

public class MinAndMax {
	
	public int bigDiff(int[] nums) {
		int result = 0;
		int maiorNumero = 0;
		int menorNumero = 0;
		for (int i : nums) {
			if( i == 0){
				menorNumero = nums[i];
			}
			if(nums[i] > maiorNumero){
				maiorNumero = nums[i];
			}
			if(nums[i] < menorNumero){
				menorNumero = nums[i];
			}
		}
		result = maiorNumero - menorNumero;
		return result;
	}

}
