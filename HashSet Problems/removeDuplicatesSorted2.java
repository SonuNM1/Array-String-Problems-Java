
// remove duplicates from array - without using any temp array

public class removeDuplicatesSorted2{
    public static void main(String[] args) {
        
        int[] array = {1,2,2,3,3,4,4,5} ; 
        int index = 0 ; 

        for(int i=0 ; i < array.length-1 ; i++){
            if(array[i] != array[i+1]){
                array[index] = array[i]; 
                index++ ; 
            }
        }
        array[index] = array[array.length-1] ; 
        index++ ; 

        for(int i=0 ; i < index; i++){
            System.out.print(array[i] + " ");
        }
    }
}