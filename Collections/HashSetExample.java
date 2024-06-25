package Collections;

import java.util.Set; 
import java.util.HashSet; 

public class HashSetExample {
    public static void main(String[] args) {
        
        Set<String> set = new HashSetExample<>() ; 
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // duplicate element

        // iterate over the set 

        for(String fruit: set){
            System.out.println(fruit);
        }

    }
}
