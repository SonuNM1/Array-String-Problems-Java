
// remove duplicates from sorted array - without creating any temp array 

/* 
public class removeDuplicates2 {
    public static void main(String[] args) {
        
        int[] sortedArray = {1,2,2,3,4,5,5} ; 
        int index = 0 ; 

        for(int i=0 ; i < sortedArray.length-1 ; i++){

            if(sortedArray[i] != sortedArray[i+1]){

                sortedArray[index] = sortedArray[i] ; 

                index++ ;      

            }
        }

        sortedArray[index] = sortedArray[sortedArray.length-1] ; // including the last element 
        index++ ;  

        System.out.println("After removing duplicates: ");

        for(int i=0 ; i < index ; i++){
            System.out.print(sortedArray[i] + " ");
        }
    }
}
    */

public class removeDuplicates2{
    public static void main(String[] args) {
        
        int[] sortedArray = {1,2,2,3,4,5,5} ; 
        int index = 0 ; 

        for(int i=0 ; i < sortedArray.length-1 ; i++){
            if(sortedArray[i] != sortedArray[i+1]){
                sortedArray[index] = sortedArray[i] ; 
                index++ ; 
            }
        }

        // inserting the last element 

        sortedArray[index] = sortedArray[sortedArray.length-1] ; 
        index++ ; 

        // printing the array 

        System.out.println("array without duplicates");

        for(int i=0 ; i < index ; i++){
            System.out.print(sortedArray[i] + ", ");
        }

    }
}
