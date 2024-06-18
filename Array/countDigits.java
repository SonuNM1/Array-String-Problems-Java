public class countDigits {
    public static void main(String args[]){

        int num = 123 ; 
        int count = 0 ; 

        while(num != 0){
            num = num / 10 ; // 12 -> 1 -> 1/10 = 0
            count++ ; // 1 -> 2 -> 3
        }

        System.out.println(count);
    }
}
