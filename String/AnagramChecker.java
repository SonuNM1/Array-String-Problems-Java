import java.util.Arrays;

public class AnagramChecker{
    public static void main(String args[]){

        String word = "listen";
        String word2= "silent" ; 

        if(word.length() != word2.length()){
            System.out.println("Not anagram");
            return ; // exit the program 
        }

        // convert to character arrays 

        char[] wordChar = word.toCharArray();
        char[] word2Char = word.toCharArray() ; 

        // sort the character arrays 

        Arrays.sort(wordChar) ; 
        Arrays.sort(word2Char) ; 

        // Compare the arrays 

        boolean isAnagram = true ; 

        for(int i=0 ; i < wordChar.length ; i++){
            if(wordChar[i] != word2Char[i]){
                isAnagram = false ; 
                break ; 
            }
        }

        // Printing the result 

        if(isAnagram){
            System.out.println("Anagram");
        } else{
            System.out.println("not anagram ");
        }

    }
}