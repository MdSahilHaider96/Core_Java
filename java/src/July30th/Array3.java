package July30th;

public class Array3 {
    public static void main(String[] args) {
        //14) 	wap to find greatest number from any array
        int[] a={3,5,6,99,1001,23};
        int max=a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
               max=a[i];
            }
        }
        System.out.println(max);
    }
}
//public class Loop004 {
//    public static void main(String[] args) {
////        int[] a = {1000, 1, 500, 4, 10, -50, 100, 200};
//        int[] a = {-1000, -1, -500, -4, -10, -50, -100, -200};
//        int g = a[0];
//        for (int i=1; i<a.length; i++) {
//            if (g < a[i]) {
//                g = a[i];
//            }
//        }
//        System.out.println("Greatest: " + g);
//    }
//}
//
