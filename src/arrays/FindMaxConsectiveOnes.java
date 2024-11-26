package arrays;

public class FindMaxConsectiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int n = nums.length;
		int count = 0;
		int maxCount = 0;
		
		for(int i = 0; i < n; i++) {
			if(nums[i] == 1 && count == maxCount) {
				count++;
				maxCount++;
			}else if(nums[i] == 0) {
				count = 0;
			}else {
				count ++;
			}
		}
		
		return maxCount;
	}

	public static void main(String[] args) {
		int[] nums = {1, 0, 1, 1, 1, 0, 1, 1, 1};
		
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
