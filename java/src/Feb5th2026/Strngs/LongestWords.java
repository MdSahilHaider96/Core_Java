package Feb5th2026.Strngs;

public class LongestWords {
    public static void main(String[] args) {
        //Find the longest word in a sentence
        String sentence = "This is a simple Java program to find the longest word";

        // Split the Sentence
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        for (String word : words){
            if (word.length() > longestWord.length()){
                longestWord = word; // update longest words
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
