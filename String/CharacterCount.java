public class CharacterCount {
    public static void main(String[] args) {
        
        String input = "  This is a sample string with several words  "; 

        input = input.trim() ; // removing the leading and trailing spaces 

        int characterCount = 0 ; 

        for(int i=0 ; i < input.length() ; i++){
            characterCount++ ; 
        }

        System.out.println("Characters in the input string: " + characterCount);

    }
}
