
public class evenOdd2 {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5, 6, 7} ; 

        int oddCount = 0; 
        int evenCount = 0; 

        int oddArr[]; 
        int evenArr[] ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                evenCount++ ; 
            }else{
                oddCount++ ; 
            }
        }

        System.out.println("Even count: " + evenCount + ", " + "Odd count: " + oddCount);

        evenArr = new int[evenCount] ; 
        oddArr = new int[oddCount] ; 

        int evenIndex = 0 ; 
        int oddIndex = 0 ; 

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                evenArr[evenIndex] = arr[i] ; 
                evenIndex++ ; 
            }
            else{
                oddArr[oddIndex] = arr[i] ; 
                oddIndex++ ; 
            }
        }

        System.out.println("Even elements: ");

        for(int i=0 ; i<evenArr.length ; i++){
            System.out.println(evenArr[i]);
        }

        System.out.println("Odd elements: ");

        for(int i=0 ; i<oddArr.length ; i++){
            System.out.println(oddArr[i]);
        }

    }    
}
