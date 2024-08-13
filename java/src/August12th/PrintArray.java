package August12th;

import org.w3c.dom.ls.LSOutput;

public class PrintArray {
    public static void printArrayWithoutLoop() {
        int[] arr={8,5,7,8,9,2};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println("End");
    }
    public static void printArrayWithForLoop(){
        int[] arr={5,1,15,48,78,96};
        for(int i=0;i<arr.length;i++){
            System.out.println("For Loop "+ arr[i]);
        }
    }
    public static  void printArrayWithForEachLoop(){
        int[] arr={5,45,9,78,69};
        for (int x:arr){
            System.out.println("For Each Loop "+x);
        }
    }
    public static void lengthOfArray(){
        int[] arr={5,78,7,8,12};
        System.out.println("Length of an Array "+arr.length);
    }

    public static void main(String[] args) {
        printArrayWithoutLoop();
        printArrayWithForLoop();
        printArrayWithForEachLoop();
        lengthOfArray();
    }
}
