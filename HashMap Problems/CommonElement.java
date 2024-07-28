
/*
- Common Elements in Two Arrays

Write a program to find common elements in two arrays using a `HashMap`.
 */

import java.util.Set ; 
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap; 

public class CommonElement {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 2, 3, 4} ; 
        int[] arr2 = {2, 2, 4, 4, 5} ; 

        Map<Integer, Integer> countMap = new HashMap<>() ; 

        Set<Integer> result = new HashSet<>() ; 

        for(int i=0 ; i < arr1.length ; i++){
            int element = arr1[i] ; 
            countMap.put(element, countMap.getOrDefault(element, 0)+1) ; 
        }

        System.out.println("Printing the count of each element in the array: ");

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Iterating through the second array 

        for(int i=0 ; i < arr2.length ; i++){
            int element = arr2[i] ; 

            if(countMap.containsKey(element) && countMap.get(element) > 0){
                result.add(element) ; 
                countMap.put(element, countMap.get(element)-1) ; 
            }
        }

        System.out.println("Common array elements: " + result);

    }
}
