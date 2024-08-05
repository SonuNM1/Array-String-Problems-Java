
import java.util.Set; 
import java.util.HashSet ; 

public class IntersectionTwoArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,1} ; 
        int[] arr2 = {2,2} ; 

        Set<Integer> intersection = new HashSet<>() ; 

        for(int i=0 ; i < arr1.length ; i++){  // 0 1 2 3
            for(int j=0 ; j < arr2.length ; j++){   // 0 1

                if(arr1[i] == arr2[j]){
                    intersection.add(arr1[i]) ; 
                }
            }
        }

        System.out.println("Intesection or Common elements: ");

        for(int element: intersection){
            System.out.print(element + " ");
        }

    }
}
