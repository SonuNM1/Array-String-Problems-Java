import java.util.HashSet;
import java.util.Iterator; 

// removing duplicate elements from Array (unsorted) using HashSet - can work for both sorted and unsorted array 

public class removeDuplicates3 {
    public static void main(String[] args) {
        
        int[] unSortedArray = {1, 2, 3, 2, 5, 4, 5} ; 

        HashSet<Integer> removeDuplicates = new HashSet<>() ; 

        for(int i=0 ; i < unSortedArray.length ; i++){

            removeDuplicates.add(unSortedArray[i]) ; 

        }

        System.out.println("After removing duplicate elements: ");

        Iterator iterator = removeDuplicates.iterator() ; 

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }    
}
