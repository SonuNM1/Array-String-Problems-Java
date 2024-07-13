public class linearSearch {
    public static void main(String[] args) {
        
        int num[] = {1, 2, 3, 4} ;

        int element = 2; 

        for(int i=0 ; i < num.length ; i++){
            if(element == num[i]){
                System.out.println(element + " is at position " + (i+1));
                break ; 
            }
        }

    }
}
