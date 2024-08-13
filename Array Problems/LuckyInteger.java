
/*
Lucky integer is an integer that has frequency equal to its value 

if there are two lucky integers, return the largest one, and if no lucky integers return -1 
 */

import java.util.Map ; 
import java.util.HashMap ; 

public class LuckyInteger {
    public static void main(String[] args) {
        
        int[] nums = {1,2,2,3,3,3} ; 

        int result = lucky(nums);

        System.out.println("Lucky integer: " + result);
    }

    public static int lucky(int[] nums){

        Map<Integer, Integer> hm = new HashMap<>() ; 

        // Populating the hashmap with the frequency of each element

        for(int i=0 ; i < nums.length ; i++){
            int element = nums[i] ; 

                hm.put(element, hm.getOrDefault(element, 0)+1) ; 
        }

        int luckyInteger = -1 ; 

        // Iterate through the map to find the largest lucky integer 

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            int key = entry.getKey() ; 
            int value = entry.getValue() ; 

            if(key == value){
                luckyInteger = Math.max(luckyInteger, key) ; 
            }
        }
        return luckyInteger ; 
    }
}
