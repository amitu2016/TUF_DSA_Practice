package arrays.Fundamentals;

public class LeftRotateArrayByOne {

	public static void rotateArrayByOne(int[] nums) {
      int n = nums.length;
      
      int first = nums[0];
      
      for(int i = 0; i < n - 1; i++) {
    	  swap(nums, i, i +1);
      }
      
      nums[n-1] = first;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
         int[] nums = {1, 2, 3, 4, 5};
         rotateArrayByOne(nums);
         
         for(int i = 0; i < nums.length; i++) {
        	 System.out.println(nums[i]);
         }
	}

}
