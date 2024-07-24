
// - Frequency of Words in a Sentence

// Write a Java program that takes a sentence and prints the frequency of each word in the sentence using a `HashMap`.

import java.util.Map;
import java.util.HashMap;

public class frequencyOfWord {
    public static void main(String[] args){

        String input = "hello hello world world" ; 

        String[] inputArray = input.split(" ") ; 

        Map<String, Integer> countFrequency = new HashMap<>() ; 

        for(String word: inputArray){
            if(countFrequency.containsKey(word)){
                countFrequency.put(word, countFrequency.get(word)+1) ;
            }
            else{
                countFrequency.put(word, 1) ; 
            }
        }

        // printing the frequency of each word in the string 

       for(Map.Entry<String, Integer> entry: countFrequency.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
       }

    }    
}
