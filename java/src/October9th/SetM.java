package October9th;
import java.util.HashSet;
import java.util.Set;

public class SetM {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(96);
        set.add(5);
        print(set);
    }
    static void print (Set<Integer> set){
        for (Integer i : set){
            System.out.println(i);
        }
    }
}
