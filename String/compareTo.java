

public class compareTo {
    public static void main(String[] args) {
        
        String str1 = "apple" ; 
        String str2 = "banana" ; 
        String str3 = "apple" ; 
        String str4 = "Apple" ; 
        String str5 = "apples" ; 
        
        // comparing str1 and str2 

        int result1 = str1.compareTo(str2) ; 
        System.out.println("Comparing " +str1 + " with" + str2 + " : " + result1);

        // Output: negative integer because "apple" is less than "banana"

        // comparing str1 and str3 

        int result2 = str1.compareTo(str3) ; 
        System.out.println("Comparing " + str1 + " with " + str3 + " : " + result2);

        // output: 0 because "apple" is equal to "apple"

    }
}
