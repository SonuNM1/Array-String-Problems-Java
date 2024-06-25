package Collections;

import java.util.Set ; 
import java.util.HashSet ; 
import java.util.Iterator ; 

public class SetExample {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>() ; 

        set.add("Sonu") ; 
        set.add("Garima") ; 
        set.add("Garima") ; // this duplicate entry will be ignored 

        Iterator<String> iterate = set.iterator() ; 

        while(iterate.hasNext()){

            String name = iterate.next(); 

            System.out.println(name);

        }


    }
}
