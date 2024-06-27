public class StringBufferExample2 {
    public static void main(String[] args) {
     
        // creating a StringBuffer object with an initial string 

        StringBuffer sb = new StringBuffer("Hello") ; 

        // append() - appends the specified string to this StringBuffer

        sb.append(" World") ; 

        System.out.println("After append: " + sb);

        // insert() - Inserts the specified string at the specified position 

        sb.insert(6, "Beautiful") ; 

        System.out.println("After insert: " + sb);

        // replace() - Replaces the subsring with the specified string

        sb.replace(6, 15, "Amazing") ; 

        System.out.println("After replace: " + sb);

        // delete() - removes the substring from the specified start to end 

        sb.delete(6, 13) ; 

        System.out.println("After delete: " + sb);

        // deleteCharAt() - removes the character at the specified index 

        sb.deleteCharAt(5) ; 

        System.out.println("Afte deleteCharAt: " + sb);

        // reverse() - reverses the sequences of characters

        sb.reverse() ; 

        System.out.println("After reverse: " + sb);

        // reversing again to return to the original sequence 

        sb.reverse() ; 

        // setCharAt() - sets the character at the specified index 

        sb.setCharAt(0, 'h');

        // charAt() - returns the character at the specified index 

        char ch = sb.charAt(1); 

        String sub = sb.substring(6, 11) ; // returns a new string that is a substring of this String 

        int length = sb.length() ; // returns the length of this sequence 

        // capacity() - Returns the current capacity 

        int capacity = sb.capacity() ; 
        System.out.println("Capacity: " + capacity);

        // toString() - Converts the sequence to a string 

        String str = sb.toString() ; 
        
        System.out.println("StringBuffer converted to String: " + str);

    }
}
