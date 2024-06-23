package Concepts; 

import java.util.HashSet ; 
import java.util.Set ; 

public class HashSet{
    public static void main(String[] args) {
        
        Set <String> hashSet = new HashSet<>() ; 

        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");

        System.out.println(hashSet) ; // output order may vary 

    }
}