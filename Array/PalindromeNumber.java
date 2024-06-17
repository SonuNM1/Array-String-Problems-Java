public class PalindromeNumber {
    public static void main(String args[]){

        // number remains the same when digits are exchanged

        int num = 16461 ; 
        int rev = 0 ; 
        int originalNum = num ; 

        while(num != 0){
            rev = (rev * 10) + (num % 10) ;
            num = num / 10 ; 
        }

        if(originalNum == rev){
            System.out.println(originalNum + " is a palindrome number");
        } else{
            System.out.println(originalNum + " is not a palindrome number");
        }
    }
}
