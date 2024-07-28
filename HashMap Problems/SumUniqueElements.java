
// - Sum of Unique Elements

// Given an array of integers, write a program to find the sum of all unique elements using a `HashMap`.

import java.util.Map ; 
import java.util.HashMap;

public class SumUniqueElements {
    public static void main(String[] args) {
        
        int[] input = {1, 2, 2, 3, 3, 2, 4};

        Map <Integer, Integer> countMap = new HashMap<>() ; 

        for(int i=0 ; i < input.length ; i++){
          int element = input[i] ; 

          countMap.put(element, countMap.getOrDefault(element, 0) +1 ) ; 
        }

        System.out.println("Printing the count of each elements: ");

        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing the unique elements: ");

        for(int key : countMap.keySet()){
            System.out.print(key + " ");
        }

        // sum of unique elements in the array 

        int sum = 0 ; 
        
        for(int key : countMap.keySet()){
          sum += key ; 
        }
        
        System.out.println("Sum of unique elements: " + sum);


    }
}
