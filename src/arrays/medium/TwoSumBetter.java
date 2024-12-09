package arrays.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumBetter {

	public static int[] twoSum(int[] nums, int target) {
		
		int n = nums.length;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < n; i++) {
			
			int num = nums[i];
			
			int targetNeeded = target - num;
			
			if(map.containsKey(targetNeeded)) {
				return new int[] {map.get(targetNeeded), i};
			}
			
			map.put(num, i);
		}
 		
		return new int[] {-1, -1};

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		int[] ans = twoSum(nums, target);
		
		for(Integer i : ans) {
			System.out.print(i+" ");
		}
		
		sc.close();

	}

}
