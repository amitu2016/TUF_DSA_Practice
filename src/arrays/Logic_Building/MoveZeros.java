package arrays.Logic_Building;

public class MoveZeros {

	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		
		int a = 0;
		int b = 1;
		
		for(int i = 0; i < n; i ++) {
			if(nums[a] == 0) {
				swap(nums, a, b);
				a = b;
				b++;
			}else {
				a++;
				b++;
			}
		}
	}
	
	private static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	public static void main(String[] args) {
		int[] nums = {0, 0, 0, 1, 3, -2};
		moveZeroes(nums);
		for(Integer val : nums) {
			System.out.println(val);
		}
	}

}
