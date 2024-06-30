package TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        int a = 40 ; 
        int b = 0 ; 

        try{
            int c = a/b ; 
            System.out.println("Result: " + c);
        }catch(Exception e){
            System.out.println("We failed to divide");
            System.out.println(e);
        }
    }
}
