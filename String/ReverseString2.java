public class ReverseString2 {
    public static void main(String[] args) {
     
        String name = "Sonu" ; 

        for(int i=name.length()-1 ; i >= 0 ; i--){
            System.out.println(name.charAt(i) + " ");
        }
    }
}
