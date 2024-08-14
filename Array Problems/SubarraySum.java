
/*
Subarray with given sum (positive integers) - Naive Approach (creating all possible subarray and matching the target sum) - loop stops after finding the first subarray with sum equal to the target sum 
 */

public class SubarraySum {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 7, 5};  
        int targetSum = 12;

        for(int i=0 ; i < arr.length ; i++){
            int currentSum = 0 ; 

            for(int j=i ; j < arr.length ; j++){
                currentSum += arr[j] ; 

                if(currentSum == targetSum){
                    System.out.println("Subarray found between indexes: " + i + " and " + j) ; 
                    return ; 
                }
            }
        }

        System.out.println("No subarray found");
    }
}
