public class sumDigits {
    public static void main(String args[]){

        int num = 1234 ; // 10
        int sum = 0 ; 
        int lastDigit ;

        while(num != 0){
            lastDigit = num % 10 ; // 4
            num = num / 10 ; 
            
            sum += lastDigit ; 
        }
        System.out.println(sum);
    }
}
