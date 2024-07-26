
/*
- Most Frequent Element

Given an array of integers, write a program to find the most frequent element using a `HashMap`.
*/

import java.util.Map;
import java.util.HashMap ; 

public class mostFrequentElement {
    public static void main(String[] args) {
        
        int[] input = {1, 2, 3, 2, 4, 2, 2} ; 

        Map<Integer, Integer> map = new HashMap<>() ; 

        // count of each element in the hashmap 

        for(int i=0 ; i < input.length ; i++){
            
            int element = input[i] ; 
            
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1) ; 
            }
            else{
                map.put(element, 1) ; 
            }
        }

        System.out.println("Printing the count of each element in the map: ");

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }

        // Printing the element with highest frequency: 

        int maxCount = 0 ; 
        int frequentElement =0 ; 

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            
            if(entry.getValue() > maxCount){
                frequentElement = entry.getKey() ; 
                maxCount = entry.getValue() ; 
            }
        }

        System.out.println("Element with highest frequency is: \n" + frequentElement + " : " + maxCount);

    }
}
