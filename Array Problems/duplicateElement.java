import java.util.HashSet ; 
import java.util.Iterator; 

public class duplicateElement{
    public static void main(String[] args) {
        
        int num[] = {1, 2, 2, 3, 4, 3} ; 

        HashSet<Integer> duplicateElements = new HashSet<>() ; 

        for(int i=0 ; i < num.length ; i++){
            for(int j=i+1 ; j <= num.length-1 ; j++){

                if((num[i] == num[j]) && !duplicateElements.contains(num[i])){
                    System.out.println(num[i]);
                    duplicateElements.add(num[i]) ; 
                }
            }
        }
        System.out.println("Printing the duplicate elements from HashSet");

        for(int duplicate: duplicateElements){
            System.out.print(duplicate+ " ") ; 
        }

        // Iterating the elements of HashSet using Iterator 

        Iterator<Integer> iterator = duplicateElements.iterator() ; 

        while(iterator.hasNext()){
            int element = iterator.next() ; 
            System.out.println(element);
        }
    }
}