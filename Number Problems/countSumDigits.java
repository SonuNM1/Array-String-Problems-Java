public class countSumDigits {
    public static void main(String[] args) {
        
        int num = 1234 ; 
        int sum = 0 ; 
        int lastDigit = 0 ; 

        while(num != 0){
            lastDigit = num % 10; // 4, 3
            num = num/10 ; // 123, 12
            sum += lastDigit ; // 4
        }
        System.out.println(sum);

    }
}
