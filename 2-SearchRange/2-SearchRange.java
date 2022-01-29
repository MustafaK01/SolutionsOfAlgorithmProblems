import java.util.Arrays;

public class SearchRange {
	public static int[] searchRange(int[] nums, int target) {
        int[] q = new int[] {-1,-1};
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==target){
                q[0]=i;
                break;
            }
        }
        for(int i = nums.length-1;i>=0;i--){
            if(nums[i]==target){
                q[1]=i;
                break;
            }
        }
        return q;
    }
	public static void main(String[] args) {
		int[] nums = {0,1,1,2,3,5,5};
		System.out.println(Arrays.toString(SearchRange.searchRange(nums,5)));
	}

}
