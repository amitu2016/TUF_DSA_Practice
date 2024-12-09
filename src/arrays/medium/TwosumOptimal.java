package arrays.medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwosumOptimal {

	public static int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];

		int n = nums.length;

		int[][] numsWithIndices = new int[n][2];

		for (int i = 0; i < n; i++) {
			numsWithIndices[i][0] = nums[i];
			numsWithIndices[i][1] = i;
		}

		Arrays.sort(numsWithIndices, (a, b) -> Integer.compare(a[0], b[0]));

		int left = 0;
		int right = n - 1;

		while (right > left) {
			
			int sum = numsWithIndices[left][0] + numsWithIndices[right][0];
			
			if (sum == target) {
				ans[0] = numsWithIndices[left][1];
				ans[1] = numsWithIndices[right][1];
				return ans;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		int[] ans = twoSum(nums, target);

		for (Integer i : ans) {
			System.out.print(i + " ");
		}

		sc.close();

	}

}
