
// remove duplicates from array - works for both sorted and unsroted array

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet ; 

public class removeDuplicates{
    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 4, 4, 5} ; 

        int[] result = remove(array) ; 

        System.out.println(Arrays.toString(result)); // to print the elements of array without duplicates 

    }

    public static int[] remove(int[] array){

        Set<Integer> mySet = new HashSet<>() ; // create a hashset to store unique elements 

        for(int num: array){
            mySet.add(num) ; // adding elements from array to the hashset 
        }

        int[] temp = new int[mySet.size()] ; 
        int index = 0 ; 

        for(int num: mySet){
            temp[index] = num ; 
            index++ ; 
        }

        return temp ; 

    }
}