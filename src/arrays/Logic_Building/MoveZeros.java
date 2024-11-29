package arrays.Logic_Building;

public class MoveZeros {

	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int[] temp = new int[n];
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(nums[i] != 0) {
				temp[count] = nums[i];
				count++;
			}
		}
		
		for(int i = 0; i < count; i++) {
			nums[i] = temp[i];
		}
		
		for(int i = count; i < n; i++) {
			nums[i] = 0;
		}
		
	}
	

	public static void main(String[] args) {
		int[] nums = {0, 0, 0, 1, 3, -2};
		moveZeroes(nums);
		for(Integer val : nums) {
			System.out.println(val);
		}
	}

}
