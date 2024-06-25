package Collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList; 

public class ArrayListMethods2 { // Changed from enum to class
    public static void main(String[] args) { // Corrected method signature

        // Create an ArrayList to hold String elements
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get the element at index 1
        System.out.println("Element at Index 1: " + fruits.get(1));

        // Set the element at index 0 to "Mango"
        fruits.set(0, "Mango");

        // Remove the element at index 2
        fruits.remove(2);

        // Print the items in the list using a for-each loop
        System.out.println("Printing the items in the list using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterate in the forward direction using ListIterator
        System.out.println("Iterating in forward direction:");
        ListIterator<String> li = fruits.listIterator();
        while (li.hasNext()) {
            String element = li.next();
            System.out.println(element);
        }

        // Iterate in the backward direction using ListIterator
        System.out.println("Iterating in backward direction:");
        while (li.hasPrevious()) {
            String element = li.previous();
            System.out.println(element);
        }

        // Check if the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());

        // Get the size of the list
        System.out.println("Size of the list: " + fruits.size());
    }
}
