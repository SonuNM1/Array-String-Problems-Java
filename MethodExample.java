public class MethodExample{

    static int addition(int x, int y){
        int z ; 
        if(x > y){
            z = x + y ; 
        } else {
            z = (x+y)*5 ; 
        }
        return z ; 
    }

    public static void main(String[] args){
        int c = addition(6, 5) ; 
        System.out.println("Result: " + c);
    }
}