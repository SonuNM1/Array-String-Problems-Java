
// write a sentence, output should be word and their length 

public class wordLength {
    public static void main(String[] args) {
        
        String sentence = "Myself Sonu NM" ; 

        String[] sentenceArray = sentence.split(" ") ; // [Myself Sonu NM]

        for(int i=0 ; i < sentenceArray.length ; i++){
            int length = sentenceArray[i].length() ; 

            System.out.println(sentenceArray[i] + " : " + length);
        }

    }    
}
