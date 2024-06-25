package Collections;

import java.util.ArrayList ; 
import java.util.List ; 
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>() ; 

        list.add("Apple") ; 
        list.add("Banana") ; 
        list.add("Cherry") ; 

       ListIterator<String> listIterator = list.listIterator() ; 

        // Forward traversal 

        while(listIterator.hasNext()){
            String fruit = listIterator.next() ; 

            System.out.println(fruit);
        }

        // Backward traversal 

        while(listIterator.hasPrevious()){
            String fruit = listIterator.previous() ; 

            System.out.println(fruit);
        }

    }
}
