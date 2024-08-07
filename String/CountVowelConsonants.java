
public class CountVowelConsonants{
    public static void main(String[] args){

        String word = "my name is sonu nm" ; 

        count(word);
    }

    public static void count(String word){

        int vowelCount = 0, consonantCount = 0 ; 

        word = word.toLowerCase() ; // convert the given word to lowercase so as to handle case-insensitivity 

        for(char ch : word.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowelCount++ ;
            }
            else if(ch >= 'a' || ch <= 'z'){
                consonantCount++ ; 
            }
        }

        System.out.println("Vowel Count: " + vowelCount + ", " + "Consonant count: " + consonantCount);

    }
}