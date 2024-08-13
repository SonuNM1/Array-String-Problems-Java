
// Leetcode problem 53 - Maximum Subarray / Kadane's Algorithm 

public class MaximumSubarray{
    public static void main(String[] args){
        
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4} ; 

        int result = maxSubArr(nums) ; 

        System.out.println("Maximum subarray: " + result);

    }

    public static int maxSubArr(int[] nums){
        int sum = 0 ; 
        int maxSum = nums[0] ; 

        for(int i=0 ; i < nums.length ; i++){

            sum = sum + nums[i] ; 

            if(sum > maxSum){
                maxSum = sum ; 
            }

            if(sum < 0){
                sum = 0 ;
            }
        }
        return maxSum ; 
    }
}