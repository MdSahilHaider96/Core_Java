package August12th;

public class Array2 {
    //04) 	wap to print only odd numbers from an array
    //	05) 	wap to print only even numbers from an array
    public static void oddNumbers(){
        int[] arr={4,6,3,6,1,7,9};
        System.out.println("ODD");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void evenNumbers(){
        int[] arr={5,48,54,2,7,9,};
        System.out.println("EVEN ");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
    }
}
