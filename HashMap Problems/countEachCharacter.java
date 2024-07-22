

import java.util.HashMap;
import java.util.Map; 

public class countEachCharacter{

    public static void getCharCount(String input){

        Map<Character, Integer> charMap = new HashMap<Character, Integer>() ; 

        char[] charArray = input.toCharArray() ; 

        for(char c: charArray){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1) ; 
            }
            else{
                charMap.put(c,1) ; 
            }
        }

        // Printing the character count 

        for(Map.Entry<Character, Integer> entry: charMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args){

        String input = "Learning to code" ; 

        getCharCount(input);

    }
}