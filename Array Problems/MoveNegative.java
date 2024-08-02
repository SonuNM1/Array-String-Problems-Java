
// move all the negative number to one side of the arra

public class MoveNegative{

    public static void move(int[] arr){
        int left = 0 ; 

        // traverse the array 

        for(int i=0 ; i < arr.length ; i++){
            // if the element is negative, swap it with the element at left pointer
            if(arr[i] < 0){
                int temp = arr[left] ; 
                arr[left] = arr[i] ; 
                arr[i] = temp ; 
                left++ ; 
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {1, -2, 3, -4, -5, 6, 7, -8, 9};

        System.out.println("Original Array: ");
        for(int element: arr){
            System.out.print(element + " ");
        }

        move(arr);

        System.out.println();
        System.out.println("Array modified");
        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}