package Feb5th2026.Strngs;

public class RepeatedChar {
    public static void main(String[] args) {
        // Find the most repeated character in String
        String str =  "SAHILHAIDER";
        char[] arr = str.toCharArray();
        char mostRepeated =' ';
        int maxCount = 0;
        for (int i=0;i<arr.length;i++){
            int count =1; // current count character
            for (int j=i+1 ; j < arr.length; j++){
                if( arr[i] == arr[j] ){
                    count++;
                }
                if (count > maxCount){
                    maxCount = count;
                    mostRepeated = arr[i];
                }
            }
        }
        System.out.println("Most repeated character: " + mostRepeated + " (appears " + maxCount + " times)");
    }
}
