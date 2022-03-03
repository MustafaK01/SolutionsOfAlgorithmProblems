public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
    	int sum = 0;
    	int temp = 0;
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i]>nums[i-1]) {
    			sum++;
    		}
    		else {
        		temp = nums[i];
    		}    		
    	}
	if(sum+1==nums.length) {
		return nums[0];
	}
    	return temp;    
    }
}

