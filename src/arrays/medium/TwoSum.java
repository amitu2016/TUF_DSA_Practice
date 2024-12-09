package arrays.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		
		 
		 int n = nums.length;
		 
		 List<Integer> ansList = new ArrayList<>();
		 
		 for(int i = 0; i < n; i++) {
			 
			 for(int j = i+1; j < n; j++) {
				 if(nums[i] + nums[j] == target) {
					 ansList.add(i);
					 ansList.add(j);
					 break;
				 }
			 }
			 
			 if(ansList.size() > 0)
				 break;
		 }
		 
		 int[] ans = new int[ansList.size()];
		 
		 for(int i = 0; i < ans.length; i++) {
			 ans[i] = ansList.get(i);
		 }
		 
		 return ans;
	        
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			 nums[i] = sc.nextInt();
		}
		
		int[] ans = twoSum(nums, 10);
		
		for(int i = 0; i <ans.length; i++) {
			System.out.println(ans[i]);
		}
		
		sc.close();
	}

}
