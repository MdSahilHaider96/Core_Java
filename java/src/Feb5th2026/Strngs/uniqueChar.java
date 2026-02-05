package Feb5th2026.Strngs;

import java.util.HashSet;
import java.util.Set;

public class uniqueChar {
    public static void main(String[] args) {
        // check if Strings has unique characters or not
        String str = "SAHIL%";
        if (hasUniqueChars(str)){
        System.out.println(str + " has  unique characters");
        } else {
        System.out.println(str + " does NOT have  unique characters");
        }
    }
    public static boolean hasUniqueChars(String str){
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()){
            if (!set.add(c)){ // if character is already in set
                return false;
            }
        }
        return true;
    }
}
