public class PalindromeString {
    public static void main(String args[]){

        // String that remains the same when its characters are reversed

 /*     String str = "jhk";
        String reverseStr = "" ; 

        for(int i=str.length()-1 ; i >= 0 ; i--){
            reverseStr += str.charAt(i) ; 
        }

        if(str.equals(reverseStr)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
*/

            // METHOD 2- StringBuilder

    String str = "MADAM" ; 
    StringBuilder reverseStr = new StringBuilder() ; 

    for(int i= str.length()-1 ; i>=0 ; i--){
        reverseStr.append(str.charAt(i)) ; 
    }

    if(str.equals(reverseStr.toString())){
        System.out.println(str + " is a palindrome");
    } else {
        System.out.println(str + " is not a palindrome");
    }

    }
}
