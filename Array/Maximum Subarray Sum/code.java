import java.util.*;

class Main {
	
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum = 0;
        
        for(int i=0; i<nums.length; i++){
            tempSum += nums[i];
            if(tempSum > maxSum){
                maxSum = tempSum;
            }
            
            if(tempSum < 0){
                tempSum = 0;
            }
        }
        return maxSum;
        
    }
	
	public static void main(String args[]) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));	
		
	}
}