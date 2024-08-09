
/*
Find the first element in an array that appears only once. If all elements repeat, return a message indicating that no unique element exists.
 */

import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){

        int[] inputArray = {4, 5, 6, 7, 5, 4, 6, 8}; // output -> 7 

        Map<Integer, Integer> frequencyCount = new HashMap<>() ; 

        for(int element: inputArray){
            frequencyCount.put(element, frequencyCount.getOrDefault(element, 0)+1) ; 
        }

        System.out.println("Printing the array elements and their frequency: ");

        for(Map.Entry<Integer, Integer> entry : frequencyCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // the first element with frequency count = 1 is the first non repeating element in the array 

        int firstNonRepeatingElement = 0 ; 

        for(int element : inputArray){
            if(frequencyCount.get(element) == 1){
                firstNonRepeatingElement = element ; 
                break ; 
            }
        }

        if(firstNonRepeatingElement != 0){
            System.out.println("The first non repeating element is: " + firstNonRepeatingElement);
        }
        else{
            System.out.println("There are no repeating elements in the given array");
        }
    }
}
