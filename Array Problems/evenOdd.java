
// Print even and odd elements of an array 

public class evenOdd {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7} ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                System.out.println("Even element: " + arr[i]);
            }else{
                System.out.println("Odd element: " + arr[i]);
            }
        }

    }    
}
