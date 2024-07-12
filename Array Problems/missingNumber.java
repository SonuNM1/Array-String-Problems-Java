public class missingNumber {
    public static void main(String[] args) {
        
        int[] num1 = {1, 2, 4, 5, 6} ;

        int actualSum = 0 ;
        int n = num1.length +1 ; // since one element is missing, so the length of array should have been  
        int expectedSum = n*(n+1)/2 ; 

        for(int i=0 ; i < num1.length ; i++){
            actualSum += num1[i] ; 
        }

        System.out.println("Actual sum: " + actualSum);
        System.out.println("Expected sum: " + expectedSum);

        int missingNumber = expectedSum - actualSum ; 

        System.out.println("Missing element: " + missingNumber);
    }
}
