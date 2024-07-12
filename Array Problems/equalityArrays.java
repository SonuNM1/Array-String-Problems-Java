
public class equalityArrays{
    public static void main(String[] args) {
        
        int num1[] = {1,2,3,4,5} ; 
        int num2[] = {1,5,3,4,5} ; 

        boolean equality = true ; 

        if(num1.length != num2.length){
            equality = false ; 
        } else {
            for(int i=0 ; i <num1.length ; i++){
                if(num1[i] != num2[i]){
                    equality = false ; 
                    break ; 
                }
            }
        }
        if(equality){
            System.out.println("Array equal");
        }else{
            System.out.println("Array not equal");
        }
    }
}