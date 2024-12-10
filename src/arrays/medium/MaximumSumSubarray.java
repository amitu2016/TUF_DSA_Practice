package arrays.medium;

public class MaximumSumSubarray {

	//Kaden's Algorithm
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			currSum+= nums[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
			
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = {-1, 2, 3, -1, 2, -6, 5};
		int ans = maxSubArray(nums);
		System.out.println(ans);
	}

}
