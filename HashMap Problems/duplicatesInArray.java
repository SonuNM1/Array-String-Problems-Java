
/*
- Finding Duplicates in an Array
Write a program to find and print all duplicate elements in an array using a `HashMap`.
 */

import java.util.Map ; 
import java.util.HashMap;

public class duplicatesInArray {
    public static void main(String[] args) {
     
        int[] inputArray = {1, 3, 3, 2, 4, 2} ; 

        Map<Integer, Integer> elementCount = new HashMap<>() ; 

        for(int element: inputArray){
            if(elementCount.containsKey(element)){
                elementCount.put(element, elementCount.get(element)+1) ; 
            }
            else{
                elementCount.put(element,1) ; 
            }
        }

        System.out.println("Printing the elements with their count");

        for(Map.Entry<Integer, Integer> entry: elementCount.entrySet()){
            System.out.println("Element - " + entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Printing the duplicate elements: ");

        for(Map.Entry<Integer, Integer> entry: elementCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Element " + entry.getKey() + " repeated " + entry.getValue() + " times");
            }
        }

    }
}
