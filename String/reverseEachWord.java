public class reverseEachWord {
    public static void main(String[] args) {

        String name = "Sonu NM";

        // Output -> unoS NM

        String[] words = name.split(" "); // ["Sonu", "NM"]

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
}
