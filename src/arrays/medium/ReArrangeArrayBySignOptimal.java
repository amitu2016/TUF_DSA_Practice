package arrays.medium;

public class ReArrangeArrayBySignOptimal {

	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		
		int[] ans = new int[n];
		
		int posIndex = 0;
		int negIndex = 1;
		
		for(int i = 0; i <n; i++) {
			
			if(nums[i] < 0) {
				ans[negIndex] = nums[i];
				negIndex +=2;
			}else {
				ans[posIndex] = nums[i];
				posIndex +=2;
			}
		}
		
		return ans;

	}
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, -1, -3, -4, 2, 3};
		
		int[] ans = rearrangeArray(nums);
		
		for(Integer val : ans) {
			System.out.print(val+" ");
		}
		
	}
}
