package Collections ; 

import java.util.ArrayList ; 
import java.util.List ; 

public class ArrayListExample2{
    public static void main(String[] args) {    
        
        ArrayList<Object> al = new ArrayList<>() ;

        al.add(10) ; 
        al.add(20) ; 
        al.add(30) ; 

        ArrayList<Object> al2 = new ArrayList<>() ; 

        al2.add("a"); 
        al2.add("b"); 
        al2.add("c"); 

        System.out.println(al);
        System.out.println(al2);

        al.addAll(al2) ; 

        System.out.println(al);

    }
}