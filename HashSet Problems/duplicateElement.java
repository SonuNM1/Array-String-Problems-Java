
import java.util.HashSet; 
import java.util.Iterator; 


public class duplicateElement {
    public static void main(String[] args) {
        
        int num[] = {1, 2, 2, 3, 4, 3, 3} ; 

        HashSet<Integer> duplicateElements = new HashSet<>() ; 

        for(int i=0 ; i < num.length ; i++){
            for(int j=i+1 ; j <= num.length-1 ; j++){

                if((num[i] == num[j]) && !duplicateElements.contains(num[i])){
                    System.out.println(num[i]);
                    duplicateElements.add(num[i]) ; 
                } 
            }
        }

        System.out.println("Printing duplicate elements with enhanced for loop");

        for(int element: duplicateElements){
            System.out.println(element);
        }

        System.out.println("Printing hashset elements with iterator");

        Iterator<Integer> iterator = duplicateElements.iterator() ; 

        while(iterator.hasNext()){
            int n = iterator.next(); 
            System.out.print(n + ", ");
        }
    }
}

/* 
public class duplicateElement{
    public static void main(String[] args) {
        
        int num[] = {1, 2, 2, 3, 4, 3, 3} ; 

        HashSet<Integer> duplicate = new HashSet<>() ; 
        
        for(int i=0 ; i < num.length ; i++){
            for(int j=i+1 ; j <num.length-1 ; j++){
                if(num[i] == num[j]){
                    System.out.print(num[i] + " ");
                    duplicate.add(num[i]) ; 
                }
            }
        }
        System.out.println();
        System.out.println("Printing the duplicate elements: ");

        for(int element: duplicate){
            System.out.print(element + " ");
        }
    }
}
    */
