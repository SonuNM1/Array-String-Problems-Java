package Concepts;

import java.util.HashMap ; 
import java.util.Map ; 

public class HashMapExample {
    public static void main(String[] args) {
        
        Map <String, String> hashMap = new HashMap <>() ; 

        hashMap.put("key1", "value1") ;
        hashMap.put("key2", "value2") ;
        hashMap.put(null, "value3") ; // allowed
        hashMap.put("key4", null) ; // allowed

        System.out.println(hashMap);

    }
}
