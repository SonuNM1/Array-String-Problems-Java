
/*
Subarray with the given sum (+ve integers) - Naive approach (creating all possible subarray and matching the target sum) - finds all the possible subarray with sum equal to the target sum
 */

public class SubarraySum2 {
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 7, 5};  
        int targetSum = 12;

        boolean found = false ; 

        for(int i=0 ; i < arr.length ; i++){
            int currentSum = 0 ; 

            for(int j=i ; j < arr.length ; j++){
                currentSum += arr[j] ; 

                if(currentSum == targetSum){
                    System.out.println("Subarray found between: " + i + " and " + j);
                    found = true ; 
                }
            }
        }

        if(!found){
            System.out.println("Subarray not found");
        }

    }    
}
