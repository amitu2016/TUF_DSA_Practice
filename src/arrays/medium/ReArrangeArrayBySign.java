package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeArrayBySign {

	public static int[] rearrangeArray(int[] nums) {
		int n = nums.length;
		
		List<Integer> posList = new ArrayList<Integer>();
		List<Integer> negList = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			if(nums[i] > 0) {
				posList.add(nums[i]);
			}else {
				negList.add(nums[i]);
			}
		}
		
		
		for(int i = 0; i < n / 2; i++) {
			nums[2 * i] = posList.get(i);
			nums[2 * i+ 1] = negList.get(i);
		}
		
		return nums;

	}
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, -1, -3, -4, 2, 3};
		
		int[] ans = rearrangeArray(nums);
		
		for(Integer val : ans) {
			System.out.print(val+" ");
		}
		
	}
}
