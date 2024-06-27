public class StringMethods {
    public static void main(String[] args){

        // Creating strings

        String str1 = "Hello world" ; 
        String str2 = "  Welcome to Java Programming" ; 
        String str3 = "Hello, World!" ; 
        String str4 = "Hello, World!" ; 
        String str5 = "Java" ; 

        // length of the string 

        System.out.println("Length of str1: " + str1.length());

        // character at a specific index 

        System.out.println("Character at indeex 7 in str1: " + str1.charAt(7));

        // substring from a string 

        System.out.println("Substring of str1 from index 7: " + str1.substring(7));

        System.out.println("Substring of str1 from index 7 to 12" + str1.substring(7, 12));

        // checking if the strings are equal 

        System.out.println("str1 equals str3: " + str1.equals(str3));

        System.out.println("str1 equals str4: " + str1.equals(str4));

        // checking if strings are equal (case-insensitive)

        System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str3));

        // Comparing strings lexicographically 

        System.out.println("str1 compared to str4: " + str1.compareTo(str4));

        System.out.println("str1 compared to str3: " + str1.compareTo(str3));

        // checkinf if a string contains another string 

        System.out.println("str1 contains 'World': " + str1.contains("World"));

        // checking if a string starts or ends with a specific prefix/suffix 

        System.out.println(str1.startsWith("Hello")
        );

        System.out.println("str1 ends with 'World!: " + str1.endsWith("World!") );

        // Index of a character or substring 

        System.out.println("Index of 'o' in str1: "+ str1.indexOf('o'));

        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o'));

        System.out.println("Index of 'World' in str1: " + str1.indexOf("World"));

        // replacing characters or substrings 

        System.out.println("Replacing 'World' with 'Java' in str1: " + str1.replace("World", "Java"));

        // Converting to upper or lower case 

        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        System.out.println("str1 in lowercase: " + str1.toLowerCase());

        // trimming leading and trailing whitespace 

        System.out.println("str2 before trim: " + str2);

        // splitting a string into an array 

        String[] words = str1.split(",") ; 

        for(String word: words){
            System.out.println(word);
        }

        // converting other types to string 

        int number = 42 ; 
        String numberStr = String.valueOf(number) ; 
        System.out.println("String representation of number: " + numberStr);

        // checking if a string is empty of blank 

        String emptyStr = "" ;
        String blankStr = " " ; 

        System.out.println("Empty: " + emptyStr.isEmpty());
        System.out.println("Blank: " + blankStr.isBlank());

        // using StrinBuilder for efficient string manipulation 

        StringBuilder sb = new StringBuilder() ; 

        sb.append("Hello") ; 
        sb.append(",") ; 
        sb.append("World") ; 

        System.out.println("StringBuilder result: " + sb.toString());

    }
}
