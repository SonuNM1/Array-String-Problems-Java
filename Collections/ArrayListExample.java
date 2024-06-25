package Collections ; 

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Iterate over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
