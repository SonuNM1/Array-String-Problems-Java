
public class SubstringString{
    public static void main(String[] args){

        String s1 = "abc" ; 
        String s2 = "abcdef" ; 

        int l1 = s1.length() ; 
        int l2 = s2.length() ; 

        boolean found = false ; 

        // iterating through s2 with a sliding window of length equal to s1

        /*
                The size of the sliding window is equal to the length of s1 because you are 
                checking for substrings of s2 that are exactly the same length as s1
         */

        for(int i=0 ; i <= l2-l1 ; i++){
            String sub = s2.substring(i, i + l1) ; 

            if(sub.equals(s1)){
                found = true ; 
                break ; 
            }
        }

        if(found){
            System.out.println(s1 + " is substring of " + s2);
        }
        else{
            System.out.println("not a substring");
        }

    }
}