public class countEvenOdd {
    public static void main(String[] args) {
        
        int num = 12345 ; 
        int odd = 0, even = 0 ; 
        int lastDigit = 0 ; 
        int [] evenArr; 
        int [] oddArr;

        int tempNum = num ; 

        // count the number of digits first 

        while(tempNum != 0){

            lastDigit = tempNum % 10 ; // 5,4, 3
            tempNum = tempNum/10 ; // 1234, 123, 12

            if(lastDigit % 2 == 0){
                even++ ; // 1
            } else{
                odd++ ; // 2
            }
        }

        // initialize arrays with correct sizes 

        evenArr = new int[even] ; 
        oddArr = new int[odd] ; 

        System.out.println("Even digit: " + even + ", " + "Odd digit: " + odd);

        // resetting num to its original value 

        tempNum = num ; 
        int evenIndex = 0 , oddIndex = 0 ; 

        // populate the array with digits 

        while(tempNum != 0){
            lastDigit = tempNum % 10 ; // 5,4, 3
            tempNum = tempNum/10 ; // 1234, 123, 12
            if(lastDigit % 2 == 0){
                evenArr[evenIndex] = lastDigit ; 
                evenIndex++ ; 
            } else{
                oddArr[oddIndex] = lastDigit;
                oddIndex++ ; 
            }
        }

        System.out.println("Even digits: ");

        for(int i=0 ; i < evenArr.length ; i++){
            System.out.println(evenArr[i] + ", ");
        }

        System.out.println("Odd digits: ");

        for(int i=0 ; i < oddArr.length ; i++){
            System.out.println(oddArr[i] + ", ");
        }



    }
}
