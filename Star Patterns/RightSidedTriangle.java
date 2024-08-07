
public class RightSidedTriangle {
    public static void main(String[] args) {
        
        int n = 5 ; 

        for(int i=1 ; i<n ; i++){
            
            // Printing the spaces 

            for(int j=1 ; j<5-i ; j++){
                System.out.print(" ");
            }

            // Printing the stars 

            for(int j=6-i ; j<=n ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }    
}
