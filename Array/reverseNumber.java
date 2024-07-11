public class reverseNumber {
    public static void main(String[] args) {
        
        int num = 12345 ; 
        int rev = 0 ; 

        while(num != 0){
            rev = rev*10 + num % 10 ; // 0+3=3 -> 30+2=32 -> 320 + 1 = 321
            num = num / 10 ; // 12-> 1  
        }

        System.out.println(rev);
    }
}
