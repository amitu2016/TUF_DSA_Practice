package arrays.medium;

import java.util.Arrays;

public class MajorityElements1 {

	public static int majorityElement(int[] nums) {
		int n = nums.length;
		
		Arrays.sort(nums);
		
		int maxCount = 0;
		int candidate = 0;
		
		for(int i = 0; i < n; i++) {
			if(nums[candidate] == nums[i]) {
				maxCount++;
			}else if(nums[candidate] != nums[i]) {
				maxCount--;
			} 
			
			if(maxCount < 0) {
				candidate++;
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(nums[i] == nums[candidate]) {
				count++;
			}
		}
		

		
		if(count > n / 2) {
			return nums[candidate];
		}
		
	
		return -1;
		
		
	}

	public static void main(String[] args) {
		int[] nums = {86,100,54,81,27,65,65,97,72,25,43,65,13,44,93,65,46,65,67,56,85,65,65,65,65,65,65,65,65,7,65,65,31,51,65,65,65,65,65,67,65,65,62,65,65,65,12,65,55,96,65,65,4,66,37,65,80,40,91,65,65,28,68,58,65,65,65,65,58,65,65,12,48,89,65,65,65,65,16,41,65,52,65,65,25,65,65,65,36,65,65,70,65,19,20,65};
		System.out.println(majorityElement(nums));
	}

}
