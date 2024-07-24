
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]){

        //  Creating a HashMap

        Map<String, Integer> wordCount = new HashMap<>() ; 

        // add some key-value pairs 

        wordCount.put("Hello",1) ; 
        wordCount.put("World",2) ; 
        wordCount.put("Java",3) ; 
        wordCount.put("Programming",4) ; 

        // retrieve values using get()

        Integer count1 = wordCount.get("Hello") ; 
        Integer count2 = wordCount.get("World") ; 
        Integer count3 = wordCount.get("Java") ; 
        Integer count4 = wordCount.get("Programming") ; 
        Integer count5 = wordCount.get("Python") ; // key 'Python' doesn't exist 
        
        // print the values 

        System.out.println("Hello: " + count1);
        System.out.println("World: " + count2);
        System.out.println("Java: " + count3);
        System.out.println("Programming: " + count4);
        System.out.println("Python: " + count5);

    }
}
