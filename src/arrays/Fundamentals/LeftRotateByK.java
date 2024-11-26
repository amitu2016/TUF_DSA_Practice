package arrays.Fundamentals;

public class LeftRotateByK {
	
	public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[k];
        
        k = k % n;
        
        for(int i = 0; i < k; i++) {
        	temp[i] = nums[i];
        }
        
        for(int i = 0; i < n - k; i++) {
        	nums[i] = nums[i + k];
        }
        
        int j = 0;
        for(int i = 0; i < k; i++) {
        	nums[n - k + i] = temp[j];
        	j++;
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
