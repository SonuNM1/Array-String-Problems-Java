public class countEvenOddDigit {
    public static void main(String args[]){

        int num = 145678 ; // even = 3 || odd = 3
        int evenCount = 0, oddCount = 0 ; 
        int unitDigit; 

        while(num != 0){
            unitDigit = num % 10 ; // 8, 7, 6, 5, 4
            num = num / 10 ; // 14567, 1456, 145, 14, 1

            if(unitDigit % 2 == 0){
                evenCount++ ; // 3
            } else{
                oddCount++ ; // 2
            }
        }

        System.out.println("Even count: " + evenCount + "\n Odd count: " + oddCount);
    }
}
