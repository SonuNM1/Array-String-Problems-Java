
public class CountVowelConsonants2 {
    public static void main(String[] args) {
        String word = "Myself SonuNM" ; 

        count(word);
    }

    public static void count(String word){
        int vowelCount = 0 , consonantCount = 0; 
        String vowels = "aeiou"; 
        word = word.toLowerCase() ; 

        for(int i=0 ; i < word.length() ; i++){
            char ch = word.charAt(i) ; 

            // check if the letter is an alphabetic letter so as to ignore the white spaces and symbols 

            if(ch >= 'a' && ch <= 'z'){
                if(vowels.indexOf(ch) != -1){
                    vowelCount++ ; 
                }
                else{
                    consonantCount++ ;
                }
            }
        }

        System.out.println("Vowel count: " + vowelCount + ", Consonant count: " + consonantCount);

    }
}
