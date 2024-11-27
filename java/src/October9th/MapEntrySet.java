package October9th;

import java.util.*;

public class MapEntrySet {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Md");
        map.put(2,"Sahil");
        map.put(3,"Haider");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.print("Key : "+ entry.getKey());
            System.out.println(" Value : "+ entry.getValue());
        }
        System.out.println(map.containsKey(2)); // shows key are present in map in (true or false)
        System.out.println(map.get(1));
        Set<Integer> keys = map.keySet(); // print all keys
        System.out.println(keys);
        Collection<String> values =  map.values(); // get all values from a map using this method
        System.out.println(values);
    }
}
