package Jan7th;
//    //	04) 	wap to print only odd numbers from an array
public class array2 {
    public static void main(String[] args) {
        int[] arr = {4,2,5,69,7};
        int[] copy = new int[arr.length];
        for (int i=0,k=0;i<arr.length;i++,k++){
            copy[k]=arr[i];
            System.out.println("This is a copy array :" + copy[k]);
            }
        }
//        for(int i =0 ; i< arr.length;i++){
//            if (arr[i] % 2!=0){
//                System.out.println("Odd numbers : " + arr[i]) ;
//            }
//            System.out.println(arr[i]);
//        }
    }

