
// remove duplicate elements from Sorted array - by creating a temp array 

/*
public class removeDuplicates{
    public static void main(String[] args) {
        
        int[] sortedArray = {1,2,2,3,4,5,5} ; 

        int[] temp = new int[sortedArray.length] ; 
        int index = 0 ; 

        for(int i=0 ; i < sortedArray.length-1 ; i++){

            if(sortedArray[i] != sortedArray[i+1]){

                temp[index] = sortedArray[i] ; 
                index++ ; 

            }
        }

        temp[index] = sortedArray[sortedArray.length-1] ; 

        System.out.println("Array without duplicate elements: ");

        for(int num: temp){
            System.out.print(num + " ");
        }
    }
}
*/

public class removeDuplicates{
    public static void main(String[] args){
        
        int[] sortedArray = {1,2,2,3,4,5,5} ; 

        int[] removeDuplicates = new int[sortedArray.length] ; 
        int index = 0 ; 

        for(int i=0 ; i < sortedArray.length-1 ; i++){
            if(sortedArray[i] != sortedArray[i+1]){
                removeDuplicates[index] = sortedArray[i] ; 
                index++ ; 
            }
        }

        // inserting the last element as it is 

        removeDuplicates[index] = sortedArray[sortedArray.length-1] ; 

        System.out.println("Array without duplicates");

        for(int num: removeDuplicates){
            System.out.print(num + ", ");
        }

    }
}