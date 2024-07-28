
/*
Find First Non-Repeating Character

Write a Java program that finds the first non-repeating character in a string using a `HashMap`.
 */

import java.util.Map ; 
import java.util.HashMap;

public class FirstNonRepeatingCharacter{
    public static void main(String[] args){

        String word = "racecars" ; // output -> w

        Map<Character, Integer> countMap = new HashMap<>() ; 

        // count of each character in the string 

        for(int i=0 ; i < word.length() ; i++){
            char element = word.charAt(i) ; 
            countMap.put(element, countMap.getOrDefault(element, 0)+1) ; 
        }

        System.out.println("Printing the count of each character in the string: ");

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("The first non-repeating character is: ");

        /* 
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break ; 
            }
        }
        */

        for(int i=0 ; i < word.length() ; i++){
            char element = word.charAt(i) ; 

            if(countMap.get(element) == 1){
                System.out.println(element);
                break ; 
            }
        }

    }
}