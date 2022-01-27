
public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] mergeArrays = new int[nums1.length+nums2.length];
			
			for(int i=0;i<nums1.length;i++) {
				mergeArrays[i]=nums1[i];
			}
			for(int j = 0;j<nums2.length;j++) {
				mergeArrays[nums1.length+j]=nums2[j];
			}
	        int temp = 0;  
			for(int i = 0;i<mergeArrays.length;i++) {
				for(int j = 1; j<mergeArrays.length-i;j++) {
                    if(mergeArrays[j-1] > mergeArrays[j]){  
                        temp = mergeArrays[j-1];  
                        mergeArrays[j-1] = mergeArrays[j];  
                        mergeArrays[j] = temp;  
                }   
				}
			}
			int q=(mergeArrays.length)/2;
			if(mergeArrays.length%2==0) {
				double x = (mergeArrays[q]+mergeArrays[q-1]);
				return x/2;
			}
			else if(mergeArrays[0]==0) {
				for(int i = 1; i<mergeArrays.length;i++) {
					if(mergeArrays[i]==0) {
						return 0;
					}
				}
			}
			return (mergeArrays[q]);
    	}
	
	
	
}
