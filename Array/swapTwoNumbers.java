public class swapTwoNumbers{
    public static void main(String args[]){

        // Logic 1 -> Third variable
    /* 
        int a = 1 ; 
        int b = 2 ; 

        System.out.println("Original Value:\n a="+a+"b="+b);

       int temp = a ; // 1
        a = b ; // 2
        b = temp ; // 1

        System.out.println("After Swapping:\n a="+a+" b="+b) ; 
    */

    // Logic 2 -> Without Using Third Variable

/*     int a = 1;
    int b = 2 ; 

    System.out.println("Original Value:\n a="+a+"b="+b);

    a = a+b ; // 3
    b = a - b; // 3-2 = 1
    a = a - b ; // 3-1 = 2

    System.out.println("After Swapping:\n a="+a+" b="+b) ;
*/

    // Logic 3 - Use Multiplication and Division without third variable (a and b values shouldn't be zero)

 /*    int a = 1 , b = 2; 

    System.out.println("Original Value:\n a="+a+"b="+b);

    a = a*b ; // 1*2 = 2
    b = a/b ; // 2/2 = 1
    a = a/b ; // 2/1 = 2

    System.out.println("After Swapping:\n a="+a+" b="+b) ;
*/


        // Logic 4 -> Bitwise XOR (both input same, output = 1 ; both input different, output = 0 )

        int a = 10, b = 20 ;

        System.out.println("Original Value:\n a="+a+"b="+b);

        a = a ^ b ;
        b = a ^ b ; 
        a = a ^ b ;

        System.out.println("After Swapping:\n a="+a+" b="+b) ;

    }
}