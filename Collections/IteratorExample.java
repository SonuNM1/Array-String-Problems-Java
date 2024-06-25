package Collections ; 

import java.util.List ; 
import java.util.ArrayList ;
import java.util.Iterator; 

public class IteratorExample{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>() ; 

        list.add("Apple") ; 
        list.add("Banana") ; 
        list.add("Cherry") ; 

        Iterator<String> iterator = list.iterator() ; 

        while(iterator.hasNext()){
            String fruit = iterator.next() ; 

            System.out.println(fruit);
        }

    }
}