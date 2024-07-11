
// a sequence where each number is the sum of the two preceding ones, typically starting from 0 and 1 

public class Fibonacci {
    public static void main(String[] args) {
        
        int num = 10 ; // number of terms in the fibonacci series 

        int firstTerm = 0, secondTerm = 1 ; 

        System.out.println("Fibonacci series upto " + num + " terms: ");

        for(int i=1 ; i <= num ; i++){
            System.out.println(firstTerm + ", "); // 0

            // Compute the next term 

            int nextTerm = firstTerm + secondTerm ; // 0+1=1, 
            firstTerm = secondTerm ; // 1
            secondTerm = nextTerm ; // 1
        }
    }
}
