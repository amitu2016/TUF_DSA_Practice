package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {

	public static List<List<Integer>> threeSum(int[] nums) {

		int n = nums.length;

		List<List<Integer>> ansList = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < n; i++) {
			
			// Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

			int j = i + 1;
			int k = n - 1;

			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];

				if (sum == 0) {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					ansList.add(temp);
					j++;
					k--;
					
					//Skipping the duplicates
					while(j < k && nums[j] == nums[j - 1]) j++;
					while(j < k && nums[k] == nums[k + 1]) k--;
					
				} else if (sum < 0) {
					j++;
				} else {
					k--;
				}

			}

		}

		return ansList;

	}
	
	public static void main(String[] args) {
		int[] nums = {2, -1,  -1, 3, -1};
		List<List<Integer>> ansList = threeSum(nums);
		System.out.println(ansList);
	}

}
