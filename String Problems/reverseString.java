public class reverseString {
    public static void main(String[] args) {
        
        String str = "Sonu NM" ; 
        String reverseStr = "" ; 

        System.out.println("Original String: " + str);

        for(int i=str.length()-1 ; i >= 0 ; i--){
            reverseStr += str.charAt(i) ; 
        }
        System.out.println("Reverse String: " + reverseStr);
    }
}
