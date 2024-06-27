public class StringBufferExample {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Sonu") ; 

        // printing the capacity of the StringBuffer object

        System.out.println(sb.capacity());

        /* length() Vs. capacity()

        both methods return an integer value. the length() method returns the number of elements stored in the String, tells the length of the data structure, while capacity() tells the number of characters that the string can store 

        */

        StringBuffer name = new StringBuffer("Sonu") ; 
        
        System.out.println(name.append(" NM"));

        System.out.println(name.charAt(1));

        System.out.println(name.delete(1, 4));

        StringBuffer name2 = new StringBuffer("Sonu") ;

        System.out.println(name.equals(name2)); // false since equals method also checks the memory location, which in this case is different 


    }
}
