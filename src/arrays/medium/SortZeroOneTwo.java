package arrays.medium;

public class SortZeroOneTwo {
	
	
	//Dutch National Flag Algorithm
    public static void sortZeroOneTwo(int[] nums) {
        int n = nums.length;
        
        int low = 0;
        int mid = 0;
        int high = n -1;
        
        //less than equals to sign --> important
        while(mid <= high) {
        	if(nums[mid] == 0) {
        		swap(nums, mid, low);
        		low++;
        		mid++;
        	}else if(nums[mid] == 1) {
        		mid++;
        	}else {
        		swap(nums, mid, high);
        		high--;
        	}
        }
    }
    
    private static void swap(int[] nums, int mid, int high) {
    	int temp = nums[mid];
    	nums[mid] = nums[high];
    	nums[high] = temp;
    }

	public static void main(String[] args) {
		int[] nums = {1, 0, 2, 1, 0};
		sortZeroOneTwo(nums);
		for(Integer i : nums) {
			System.out.println(i);
		}
	}

}
