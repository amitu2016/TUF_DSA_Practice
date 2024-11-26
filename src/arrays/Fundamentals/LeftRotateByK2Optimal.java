package arrays.Fundamentals;

public class LeftRotateByK2Optimal {
	
	public static void rotateArray(int[] nums, int k) {
       int n = nums.length;
       k = k % n;
       
       reverseArray(nums, 0, k - 1);
       reverseArray(nums, k, n - 1);
       reverseArray(nums, 0, n - 1);
    }
	
	public static void reverseArray(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = {3, 4, 1, 5, 3, -5};
		rotateArray(nums, 8);
		for(Integer i : nums) {
			System.out.println(i);
		}
	}

}
