package arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		
		int n = nums.length;
		
		Set<List<Integer>> set = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {
				
				for(int k = j + 1; k < n; k++) {
					
					if(nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> temp = new ArrayList<>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						Collections.sort(temp);
						set.add(temp);
					}
				}
			}
		}
		
		return new ArrayList<List<Integer>>(set);

	}

	public static void main(String[] args) {
		int[] nums = {2, -2, 0, 3, -3, 5};
		List<List<Integer>> ans = threeSum(nums);
		
		System.out.println(ans);

	}

}
