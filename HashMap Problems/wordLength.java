
/*
- Word Lengths in a Sentence

Write a Java program that takes a sentence and returns a `HashMap` with each word as the key and its length as the value.
 */

import java.util.Map;
import java.util.HashMap;

public class wordLength {
    public static void main(String[] args) {
        
        String sentence = "Myself Sonu NM" ; 

        Map<String, Integer> countMap = new HashMap<>() ;

        String[] sentenceArray = sentence.split(" ") ; 

        for(int i=0 ; i < sentenceArray.length ; i++){
            int length = sentenceArray[i].length(); 

            countMap.put(sentenceArray[i], length) ; 
        }

        System.out.println("Word and their count: ");

        for(Map.Entry<String, Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
