
// Subarray with given sum - O(n)

import java.util.ArrayList ; 

public class SubarraySum4{
    public static void main(String[] args){

      int[] arr = {1,2,3,7,5} ;
      int targetSum = 12 ; 
      
      int i = 0 ; 
      int currentSum = 0 ;

      boolean found = false ; 

    ArrayList<Integer> output = new ArrayList<>() ; 

      for(int j=0 ; j < arr.length ; j++){

        currentSum = currentSum + arr[j] ; 

        while(currentSum > targetSum && i <= j){
            currentSum = currentSum-arr[i] ;
            i++ ; 
        }

        if(currentSum == targetSum){
            System.out.println("Subarray found between indexes: " + i + " and " + j);
            
            // Printing the subarray 

            for(int k=i ; k <= j ; k++){
                System.out.print(arr[k] + " ");
            }

            System.out.println();
            found = true ; 
        }
      }

      if(!found){
        System.out.println("No subarray found");
      }

    }
}