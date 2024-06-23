package Concepts;

import java.util.Set ;
import java.util.TreeSet ; 
import java.util.* ; 

public class TreeSet {
    public static void main(String[] args) {
        
        Set <String> treeSet = new TreeSet<>() ; 

        treeSet.add("apple") ; 
        treeSet.add("banana") ; 
        treeSet.add("cherry") ; 

        System.out.println(treeSet) ; // output will be [apple, banana, cherry]

    }
}
