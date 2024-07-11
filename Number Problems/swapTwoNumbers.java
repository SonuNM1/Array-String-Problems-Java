public class swapTwoNumbers {
    public static void main(String[] args) {
        
        int a = 1 ; 
        int b = 2 ; 

        System.out.println("Before Swapping: ");

        System.out.println(a + " " + b);

        a = a + b ; // 1+2 = 3
        b = a - b ; // 3-2 = 1
        a = a - b ; // 3-1 = 2

        System.out.println("After Swapping: ");

        System.out.println(a + " " + b);

    }
}
