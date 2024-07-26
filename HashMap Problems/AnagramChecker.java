
import java.util.Map;
import java.util.HashMap;

public class AnagramChecker{
    public static void main(String[] args) {

        /* 
        String word = "listen";
        String word2 = "silent" ; 

        // if lengths are different, they cannot be anagram 

        if(word.length() != word2.length()){
            System.out.println("Not anagram");
            return ; 
        }

        // creating a frequency map 

        Map<Character, Integer> wordMap = new HashMap<>() ;
        
        // Populate the frequency map with characters in first string 

        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i) ; 

            wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1) ; 
        }

        // updating the frequency map with characters in the second string 

        for(int i=0 ; i<word2.length() ; i++){
            char ch = word2.charAt(i) ; 

            if(!wordMap.containsKey(ch)){       // if character is not in the map, they aren't anagram 
                return  ; 
            }
            else if(wordMap.get(ch) == 1){        // if the character's frequency is 1, remove them from the map
                wordMap.remove(ch) ; 
            }
            else{
                wordMap.put(ch, wordMap.get(ch)-1);     // decrement the character's frequency 
            }
        }

        // if map is empty, then strings are anagram 

        if(wordMap.size() == 0){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
            */

            String word = "listen";
            String word2 = "silent" ; 

            Map<Character, Integer> wordMap = new HashMap<>() ; 

            if(word.length() != word2.length()){
                System.out.println("Not anagram");
                return ; 
            }

            // populatin the map with character and their count from string 1

            for(int i=0 ; i < word.length() ; i++){
                char ch = word.charAt(i) ; 

                wordMap.put(ch, wordMap.getOrDefault(ch, 0)+1) ; 
            }

            // updating the map with characters from String 2 by decrementing the count of respective characters 

            for(int i=0 ; i < word2.length() ; i++){
                char ch = word2.charAt(i) ; 

                if(!wordMap.containsKey(ch)){
                    System.out.println("Not anagram");
                    return ; 
                }
                else if(wordMap.get(ch) == 1){
                    wordMap.remove(ch) ; 
                }
                else{
                    wordMap.put(ch, wordMap.get(ch)-1) ;
                }
            }

            if(wordMap.size() == 0){
                System.out.println("anagram");
            }
            else{
                System.out.println("not anagram");
            }
    }
}