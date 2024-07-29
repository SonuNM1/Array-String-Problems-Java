
/*
- Frequency of Each Digit in an Integer

Write a Java program to count the frequency of each digit in a given integer using a `HashMap`.
 */

import java.util.Map ; 
import java.util.HashMap ; 

public class FrequencyEachDigit{
    public static void main(String[] args){

        int number = 12321 ; 

        Map<Integer, Integer> digitFrequency = new HashMap<>() ; 

        String numberStr = String.valueOf(number) ;   // Converting the integer to string

        char[] numberArray = numberStr.toCharArray() ; 

        for(char c : numberArray){
            int digit = Character.getNumericValue(c) ; 
            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0)+1) ; 
        }

        System.out.println("Printing the count of each digit in the number: ");

        for(Map.Entry<Integer,Integer> entry: digitFrequency.entrySet()){
            System.out.println("Digit " + entry.getKey() + " : " + entry.getValue() + " times");
        }

    }
}