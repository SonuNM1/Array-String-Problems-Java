public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 5, 4} ;
        int temp = 0 ; 

        System.out.println("Before Sorting: " );

        for(int num: arr){
            System.out.print(num + " ");
        }
        
        for(int i=0 ; i < arr.length ; i++){
            for(int j=i+1 ; j <= arr.length-1 ; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i] ; 
                    arr[i] = arr[j] ; 
                    arr[j] = temp ; 
                }
            }
        }

        System.out.println();
        System.out.println("After sorting: ");

        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
