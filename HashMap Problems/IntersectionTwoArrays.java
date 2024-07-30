
/*
- Intersection of Two Arrays

Given two arrays, write a program to find their intersection using a `HashMap`.
 */

import java.util.Set ; 
import java.util.HashSet; 
import java.util.Map ; 
import java.util.HashMap ; 

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>() ; 

        Set<Integer> result = new HashSet<>() ; 

        for(int i=0 ; i < array1.length ; i++){
            int element = array1[i] ; 
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0)+1) ; 
        }

        for(int i=0 ; i < array2.length ; i++){
            int element = array2[i] ; 

            if(frequencyMap.containsKey(element) && frequencyMap.get(element) > 0){
                result.add(element) ; 
                frequencyMap.put(element, frequencyMap.get(element)-1) ; 
            }
        }

        System.out.println("Printing the common elements: ");

        System.out.println(result);

    }
}
