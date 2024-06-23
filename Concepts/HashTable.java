package Concepts;

import java.util.Hashtable ; 
import java.util.Map; 

public class HashTable {
    public static void main(String[] args) {
        
        Map <String, String> hashTable = new Hashtable<>() ; 

        hashTable.put("key1", "value1"); 
        hashTable.put("key2", "value2") ; 

        /* 
        hashTable.put(null, "value3") ; // throws NullPointerException 

        hashTable.put("key4", null) ; // throws NullPointerException
        */
        
        System.out.println(hashTable);



    }
}
