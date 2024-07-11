
public class FibonacciSum {
    public static void main(String[] args) {
        
        int firstNum = 0 ;
        int secondNum = 1 ; 
        
        int n = 4, sum = 0 ; 

        int nextSum = 0 ; 

        for(int i=1 ; i<=n ; i++){
            System.out.println(firstNum + " ");

            sum += firstNum ; 

            // Compute the next term 

            nextSum = firstNum + secondNum ; 

            firstNum = secondNum ; 
            secondNum = nextSum ; 

        }

        System.out.println("Sum of fibonacci series: " + sum);
    }    
}
