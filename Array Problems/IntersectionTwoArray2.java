
import java.util.Set;
import java.util.HashSet;

public class IntersectionTwoArray2 {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,1} ; 
        int[] arr2 = {2,2} ; 

        Set<Integer> intersection = new HashSet<>() ; // using hashset to store unique elements 

        // using the hashset to store elements of the first array 

        Set<Integer> set1 = new HashSet<>() ; 

        for(int num: arr1){
            set1.add(num) ; 
        }

        // checking elements of the second array for intersection 

        for(int num : arr2){
            if(set1.contains(num)){
                intersection.add(num) ; 
            }
        }

        System.out.println("The intersection or common elements are: ");

        for(int element: intersection){
            System.out.print(element + " ");
        }
    }
}
