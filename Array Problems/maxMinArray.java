
public class maxMinArray{
    public static void main(String[] args) {
        
        int [] num = {1,3,-1, 5, 6} ; 

        int max = num[0] ; 
        int min = num[0] ; 

        for(int i=0 ; i < num.length ; i++){
            if(num[i] > max){
                max = num[i] ; 
            }
            else{
                min = num[i] ; 
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}