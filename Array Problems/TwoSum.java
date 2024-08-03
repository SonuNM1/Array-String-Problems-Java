
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
 */

import java.util.Map; 
import java.util.HashMap; 

public class TwoSum{

    public static int[] twoSum(int[] input, int target){

        Map<Integer, Integer> map = new HashMap<>() ; 

        for(int i=0 ; i < input.length ; i++){ // 0

            int element = target - input[i] ; // 9-2 = 7

            // check if the required element exists in the map 

            if(map.containsKey(element)){

                // if it does, return the indices of the current element and the required element 

                return new int[] {map.get(element), i} ; 
            }

            // if the required element doesn't exist in the map, add the current element and its current index in the map 

            map.put(input[i], i) ; 
        }

        // if no solution found, return an empty array 

        return new int[] {} ; 

    }
    public static void main(String[] args){

        int[] input = {2, 7, 11, 15} ; 
        int target = 9 ; 

        int[] result = twoSum(input, target) ; 

        if(result.length == 0){
            System.out.println("No indices found");
        }
        else{
            System.out.print(result[0] + ", " + result[1]);
        }

    }
}