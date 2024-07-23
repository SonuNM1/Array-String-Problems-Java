
// remove duplicate from the sorted array (duplicate elements will be adjacent to the current element)
 
import java.util.Arrays;

public class removeDuplicateSorted {
    public static void main(String[] args) {

        int[] array = {1,2,2,3,4,5,5} ; 

        int[] result = removeDuplicates(array) ; 

        System.out.println(Arrays.toString(result));

    }

    public static int[] removeDuplicates(int[] array){
        
        if(array.length == 0){
            return new int[0] ; 
        }

        int[] temp = new int[array.length] ; // creating temp array with the same length as the original array
        int index = 0 ; 

        for(int i=0 ; i < array.length-1 ; i++){
           if(array[i] != array[i+1]){

                temp[index] = array[i];
                index++ ; 
           }
        }

        temp[index] = array[array.length-1] ; 

        return temp ; 
    }
}
