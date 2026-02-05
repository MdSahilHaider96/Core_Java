package Feb5th2026.Strngs;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        // Capitalize First Letter of each word
        String sentence = "hello world! welcome to java programming.";
        String[] words = sentence.split("\\s+"); // split by spaces
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : words){
            if (word.length() > 0){
                stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        String result = stringBuilder.toString().trim();
        System.out.println(result);
    }
}
