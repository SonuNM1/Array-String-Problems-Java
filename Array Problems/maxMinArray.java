public class maxMinArray {
    public static void main(String[] args) {
        
        int arr[] = {2,1,4,5,3} ; 

        if(arr.length == 0){
            System.out.println("Array is empty");
            return ; 
        }

        int max = arr[0] ; // initializing max with the first element of array 
        int min = arr[0] ; // initializing min with the first element of array 

        for(int i=1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i] ; 
            }
            if(arr[i] < min){
                min = arr[i] ; 
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

    }
}
