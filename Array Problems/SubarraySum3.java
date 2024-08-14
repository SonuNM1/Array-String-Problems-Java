
/*
Subarray with the given sum (+ve integers) - Naive approach (creating all possible subarray and matching the target sum) - finds all the possible subarray with sum equal to the target sum

print the subarray as well 
 */

public class SubarraySum3 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 7, 5};  
        int targetSum = 12;

        boolean found = false ; 

        int n = arr.length ; 

        for(int i=0 ; i < n ; i++){
            int currentSum = 0 ; 

            for(int j=i ; j < n ; j++){
                currentSum += arr[j] ; 

                if(currentSum == targetSum){
                    found = true ; 
                    System.out.println("Subarray starts from: " + i + " and " + j) ; 

                    // Print the elements of subarray 

                    for(int k=i ; k <= j ; k++){
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found){
            System.out.println("Subarray not found");
        }
    }
}
