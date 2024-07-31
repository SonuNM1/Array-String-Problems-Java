public class linearSearch {
    public static void main(String[] args) {
        
        int num[] = {1, 2, 3, 4} ;

        int element = 2; 
        boolean found = false ;
        
        for(int i=0 ; i < num.length ; i++){
            if(element == num[i]){
                System.out.println("Element found at index: " + i);
                found = true ; 
                break ; 
            }
        }

        if(!found){
            System.out.println("element not found");
        }

    }
}
