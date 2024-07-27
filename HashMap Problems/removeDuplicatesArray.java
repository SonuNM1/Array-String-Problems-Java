// Write a program to remove duplicates from an array and print the unique elements using a HashMap.

import java.util.Map; 
import java.util.HashMap;

public class removeDuplicatesArray{
    public static void main(String[] args) {
       
        int[] input = {1, 2, 2, 3, 3, 2, 4};

        Map<Integer, Integer> countMap = new HashMap<>() ; 

        // counting the occurrences of each element and their counts 

        for(int element: input){
            countMap.put(element, countMap.getOrDefault(element, 0)+1) ; 
        }

        System.out.println("Elements and their counts: ");

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing the unique elements: ");

        for(int key: countMap.keySet()){
            System.out.print(key + " ");
        }

    }
}