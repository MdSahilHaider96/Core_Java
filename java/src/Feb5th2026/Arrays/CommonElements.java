package Feb5th2026.Arrays;

import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        // Find Common Elements in three sorted Array
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {2,2,3,4,5};

        // add all elemets into HashSet
        HashSet<Integer>  set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        // keep only elements present in second array
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : arr2){
            set.contains(num);
            set2.add(num);
        }
        // keep only elements present in third array
        System.out.println("Common Elements : ");
        for (int num : arr3){
            if(set2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
