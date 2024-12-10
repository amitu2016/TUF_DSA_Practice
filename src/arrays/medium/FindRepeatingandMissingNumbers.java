package arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class FindRepeatingandMissingNumbers {

	 public static int[] findMissingRepeatingNumbers(int[] nums) {
		
		int n = nums.length;
		
		int[] ans = new int[2];
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer val : nums) {
			if(set.contains(val))
				ans[0] = val;
			set.add(val);
		}
		
		int[] temp = new int[n];
		
		for(int i = 0; i < n; i++) {
			temp[i] = i + 1;
		}
		
		for(int i = 0; i < n; i++) {
			if(!set.contains(temp[i])) {
				ans[1] = temp[i];
			}
		}
		
		
		 return ans;

	 }
	
	public static void main(String[] args) {
		int[] nums = {6, 5, 7, 1, 8, 6, 4, 3, 2};
		
		int[] ans = findMissingRepeatingNumbers(nums);
		
		for(Integer val : ans) {
			System.out.println(val);
		}
	}

}
