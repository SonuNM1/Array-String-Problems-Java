
public class countCharacters{
    public static void main(String[] args) {
        
        String input = "My name is Sonu N Mahto" ;
        
        int length = input.length() ; 

        String character = "a" ; 

        int length2 = input.replaceAll(character, "").length() ;
        
        int count = length-length2 ; 
        
        System.out.println(count);

    }
}