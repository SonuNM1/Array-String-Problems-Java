public class reverseString{
    public static void main(String args[]){

/* 

        // Method 1

        String name = "Sonu NM" ; 
        String reverseName = "" ; 

        System.out.println("Original String: " + name);

        for(int i= name.length()-1 ; i >= 0; i--){
            reverseName += name.charAt(i) ; 
        }

        System.out.println("Reverse String: " + reverseName);

        */



        // Method 2

    String name = "Sonu NM" ; 
    
    StringBuilder reverseName = new StringBuilder() ; 

    System.out.println("Original String: " + name);

    for(int i = name.length()-1 ; i >= 0 ; i-- ){

        reverseName.append(name.charAt(i)) ; 

    }

    System.out.println("Reverse String: " + reverseName.toString());
    
    System.out.println("Reverse String: " + reverseName);

    }
}