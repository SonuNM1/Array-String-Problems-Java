
public class removeSpecialCharacters {

    // method to remove special characters from a string 

    public static String remove(String input){

        // use regex to replace special characters with an empty string . The regex [^a-zA-Z0-9] matches any character that is not a letter. The replaceAll method replaces these characters with an empty string 

        String regex = "[^a-zA-Z0-9]" ; 

        return input.replaceAll(regex, "") ; 

    }

    public static void main(String[] args) {
        
        String input = "Hello@World#2024!" ; 

        String result = remove(input) ; 

        System.out.println("Original: " + input);
        System.out.println("Cleaned: " + result);
    }
}
