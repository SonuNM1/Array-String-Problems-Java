import java.util.Arrays ; 

public class SortingBuiltIn {
    public static void main(String[] args) {
        
        int [] arr = {4,3,2,1,5} ; 

        System.out.println("Before sorting: ");

        for(int num: arr){
            System.out.print(num + " ");
        }

        Arrays.sort(arr) ; 

        System.out.println();
        System.out.println("After sorting: ");

        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
