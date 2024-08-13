public class UglyNumber {
    public static void main(String[] args) {
        int n = 6; 
        
        System.out.println(ugly(n));
    }   
    
    public static boolean ugly(int n) {

        if (n <= 0) {
            return false; 
        }

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2; 
            } else if (n % 3 == 0) {
                n = n / 3; 
            } else if (n % 5 == 0) {
                n = n / 5; 
            } else {
                return false;  // If n is not divisible by 2, 3, or 5, it's not an ugly number
            }
        }

        return true; 
    }
}
