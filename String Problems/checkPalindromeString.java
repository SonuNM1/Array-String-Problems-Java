
public class checkPalindromeString {
    public static void main(String[] args) {
        
        String str = "ana" ; 
        String reverseStr = "" ; 
        String originalStr = str ; 

        for(int i= str.length()-1 ; i>=0 ; i--){
            reverseStr += str.charAt(i) ; 
        }

        if(originalStr.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
