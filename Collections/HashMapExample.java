package Collections;

import java.util.Map ; 
import java.util.HashMap ; 

public class HashMapExample {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>() ; 

        map.put(1, "Apple") ; 
        map.put(2, "Banana") ; 
        map.put(3, "Cherry") ; 

        // iterate over the map 

        for(Map.Entry<Integer, String> entry: map.entrySet()){
         //   System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()) ; 

            // access the key and value from each entry 

            Integer key = entry.getKey() ; 
            
            String value = entry.getValue() ; 

            

            System.out.println("Key: "+ key + ", Value: "+ value) ; 

        }

    }
}
