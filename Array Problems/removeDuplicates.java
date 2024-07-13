
import java.util.HashSet; 
import java.util.Iterator; 

public class removeDuplicates{
    public static void main(String[] args) {
        
        int num[] = {1, 2, 2, 3, 4, 3} ; 

        HashSet<Integer> uniqueElements = new HashSet<>() ; // to store unique elements 

        HashSet<Integer> duplicateElements = new HashSet<>() ; // to store duplicate elements 

       for(int n: num){
            uniqueElements.add(n) ; 
            if(!uniqueElements.contains(n)){
                duplicateElements.add(n) ; 
            }
       }

       Iterator<Integer> integer = duplicateElements.iterator() ; 

       System.out.println("Duplicate elements: ");

       while(integer.hasNext()){
            int element = integer.next() ; 
            System.out.print(element + " ");
       }

    }
}