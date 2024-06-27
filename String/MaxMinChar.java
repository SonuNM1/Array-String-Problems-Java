public class MaxMinChar {
    public static void main(String[] args) {
        
        String str = "example string with some repeated characters " ; 

        // Array to store the frequency of each character 

        int[] count = new int[256] ; 

        // count the occurrences of each character

        for(char c: str.toCharArray()){
            count[c]++ ;
        }

        // initialize variables to store the maximum and minimum occuring character 

        char maxChar = ' ' ; 
        char minChar = ' ' ; 
        
        int maxCount = -1; 
        int minCount = Integer.MAX_VALUE ; 

        // Iterate through the array to find the max and min occurring character 

        for(int i=0 ; i < count.length ; i++){

            if(count[i] > 0){ // ignore characters that do not appear

                if(count[i] > maxCount ){
                    maxCount = count[i] ; 
                    maxChar = (char)i; 
                }

                if(count[i] < minCount ){
                    minCount = count[i] ; 
                    minChar = (char) i ; 
                }

            }

        }

        // print the results 

        

    }
}
