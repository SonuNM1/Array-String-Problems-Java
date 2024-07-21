
public class removeWhiteSpaces {

    // method to remove white spaces from string 

    public static String remove(String input){
        return input.replaceAll(" ", "") ; 
    }
    public static void main(String[] args){

        String name = "Sonu N Mahto" ; 
        String result = remove(name) ; 

        System.out.println("Original: " + name);
        System.out.println("Desired: " + result);
    }
}
