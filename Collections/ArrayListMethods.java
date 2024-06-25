package Collections;

import java.util.List ; 
import java.util.ArrayList ;
import java.util.Iterator; 

public class ArrayListMethods {
    public static void main(String[] args) {
        
        // Create an ArrayList to hold String elements

        ArrayList<String> fruits = new ArrayList<>() ; 

        // adding elements to the ArrayList 

        fruits.add("Apple") ; 
        fruits.add("Banana") ; 
        fruits.add("Cherry") ; 
        fruits.add("Date") ; 

        // print the initial ArrayList 

        System.out.println("Initial ArrayList: " + fruits) ;

        // check if the ArrayList contains a specific elements 

        boolean containsBanana = fruits.contains("Banana") ; 

        System.out.println("Contains Banana: " + containsBanana);

        // get the size of the ArrayList

        int size = fruits.size() ; 
        System.out.println("Size of ArrayList: " + size);

        // get an element at a specific index

        String firstFruit = fruits.get(0) ; 
        System.out.println("Element at index 0: " + firstFruit);

        // set an element at a specific index

        fruits.set(1, "BlueBerry") ; 
        System.out.println("ArrayList after set: " + fruits);

        // get the index of a specific element 

        int indexOfCherry = fruits.indexOf("Cherry") ; 
        System.out.println("Index of Cherry: " + indexOfCherry);

        // Using iterator to traverse the Arraylist

        Iterator<String> iterator = fruits.iterator() ; 

        System.out.println("Traversing ArrayList using Iterator");

        while(iterator.hasNext()){
            String fruit = iterator.next() ; 

            System.out.println(fruit);
        }

    }
}
