
import java.util.Set; 
import java.util.HashSet ; 

public class AllSubstrings{
    public static void main(String[] args) {

        String input = "abc" ; 

        Set<String> substrings = new HashSet<>() ; 

        for(int i=0 ; i < input.length() ; i++){
            for(int j=i+1 ; j <= input.length() ; j++){

                String substring = input.substring(i, j);
                substrings.add(substring) ; 

            }
        }

        for(String element: substrings){
            System.out.println(element);
        }

    }
}