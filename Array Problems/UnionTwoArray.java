
import java.util.Set; 
import java.util.HashSet; 

public class UnionTwoArray{
    public static void main(String[] args){

        int[] arr1 = {1,1,1,2,2,3,3,3} ; 
        int[] arr2 = {3,3,3,4} ; 

        // using a hashset to store unique elements 

        Set<Integer> result = new HashSet<>() ; 

        // adding elements of first array to the hashset

        for(int i=0 ; i < arr1.length ; i++){
            result.add(arr1[i]) ; 
        }

        // adding elements of second array to the hashset

        for(int i=0 ; i < arr2.length ; i++){
            result.add(arr2[i]) ; 
        }

        for(int element: result){
            System.out.print(element + " ") ; 
        }

    }
}