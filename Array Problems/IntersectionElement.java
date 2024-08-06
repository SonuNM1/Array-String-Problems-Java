
import java.util.Set ; 
import java.util.HashSet ; 
import java.util.ArrayList;

public class IntersectionElement {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        ArrayList<Integer> result = new ArrayList<>() ; 

        HashSet<Integer> set = new HashSet<>() ; 

        // adding the elements of first array to the hashset 

        for(int element: arr1){
            set.add(element) ; 
        }

        // checking if the hashset contains the elements from the second array as well, if yes add it to the arraylist 

        for(int element: arr2){
            if(set.contains(element)){
                result.add(element) ; 
            }
        }

        System.out.println("Intersection/Common elements are: " + result);

    }
}
