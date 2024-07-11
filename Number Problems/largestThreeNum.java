public class largestThreeNum {
    public static void main(String[] args){

        int a = 11 ; 
        int b = 21 ; 
        int c = 34 ;

        int max = a ; 

        if(b>max && b>c){
            max = b ; 
        }
        else if(c>max && c>b){
            max = c ; 
        }
        else{
            max = a ; 
        }
        System.out.println("Largest element: " + max);

    }
}
