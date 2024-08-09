
/*
Number of words in the given string 
 */

public class NumberOfWords {
    public static void main(String[] args) {
        
        String input = "   This is a sample string with several words    "; 

        input = input.trim() ; // removes leading and trailing spaces 

        // checking if the string is empty after trimming 

        if(input.isEmpty()){
            System.out.println("Number of words: 0");
            return ; 
        }

        String[] words = input.split(" ") ; 

        int wordCount = words.length ; 

        System.out.println("Number of words: " + wordCount);

    }
}
