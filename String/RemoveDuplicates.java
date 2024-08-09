
import java.util.Map ;
import java.util.HashMap ; 
import java.util.Iterator ; 

public class RemoveDuplicates{
    public static void main(String[] args) {
        
        String input = "Myself SonuNM" ;

        input = input.toLowerCase() ; 

        Map<Character, Integer> inputMap = new HashMap<>() ; // hashmap to store the character and their count 

        for(char ch: input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch, 0)+1) ; 
        }

        System.out.println("Printing each character and their frequency: ");

       for(Map.Entry<Character, Integer> entry: inputMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
       }

       /* 
       System.out.println("Printing the character and its frequency using Iterator");

       Iterator<Map.Entry<Character, Integer>> iterator = inputMap.entrySet().iterator() ; 

       // iterating through the hashmap and printing its elements 
       
       while(iterator.hasNext()){
        Map.Entry<Character, Integer> entry = iterator.next() ; 

        System.out.println("Key: " + entry.getKey() + " : " + entry.getValue());
       }
    */


       // Adding the unique elements (character with frequency = 1) to StringBuilder

       StringBuilder output = new StringBuilder() ; 

       for(char ch: input.toCharArray()){
            if(inputMap.get(ch) == 1){
                output.append(ch) ; 
            }
       }

       System.out.println("Unique elements: " + output);


    }
}