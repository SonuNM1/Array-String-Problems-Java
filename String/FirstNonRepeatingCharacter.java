
/*
Find the first non-repeating (unique) character in a given string. A non-repeating character is one that appears exactly once in the string.

Explanation
Input:

You are given a string, which can contain any characters including letters, digits, and symbols.
Output:

You need to return or print the first character in the string that appears only once. If all characters repeat or if there are no unique characters, you should return or print a message indicating that no such character exists.
 */

import java.util.Map ;
import java.util.HashMap; 

public class FirstNonRepeatingCharacter {
    public static void main(String[] args){

        String input = "Swiss" ;
        input = input.toLowerCase() ; // turning the input to lowercase so as to manage the case-insensitivity
        
        Map<Character, Integer> inputMap = new HashMap<>() ; 

        for(char ch: input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1) ; 
        }

        System.out.println("Printing the character and their frequency count: ");

        for(Map.Entry<Character, Integer> entry: inputMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // finding the first character with frequency = 1

        char firstNonRepeatingCharacter = ' ' ; 

        for(char ch: input.toCharArray()){
            if(inputMap.get(ch) == 1){
                firstNonRepeatingCharacter = ch ; 
                break ; 
            }
        }

        if(firstNonRepeatingCharacter != ' '){
            System.out.println("The first non-repeating character is: " + firstNonRepeatingCharacter);
        }
        else{
            System.out.println("There are no non-repeating character in the given string");
        }

    }
}
