
import java.util.HashMap;
import java.util.Map; 

public class mostRepeatedCharacter {

    public static void getCharCount(String input){

        Map<Character, Integer> charMap = new HashMap<Character, Integer>() ; 

        char[] charArray = input.toCharArray() ; 

        for(char c: charArray){
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c)+1) ; 
            }
            else{
                charMap.put(c, 1) ; 
            }
        }

        // printing the count of occurences of characters in the String 

        for(Map.Entry<Character, Integer> element: charMap.entrySet()){

            System.out.println(element.getKey() + " : " + element.getValue());

        }

        // character with most occurrences 

        char mostRepeatedCharacter = ' ';
        int maxCount = 0; 

        for(Map.Entry<Character, Integer> entry: charMap.entrySet()){

            if(entry.getValue() > maxCount){
                mostRepeatedCharacter = entry.getKey() ; 
                maxCount = entry.getValue() ; 
            }
        }

        if(mostRepeatedCharacter != ' '){
            System.out.println("Character with most repetition: " + mostRepeatedCharacter);
        }
        else{
            System.out.println("The most repeated character is actually a white space with count: " + maxCount);
        }

    }

    public static void main(String[] args) {
        
        String input = "Hello i am learning to code" ; 
        getCharCount(input);

    }
}
