package August12th;

public class ReverseArray {
    public void commomElements(){
        //reverse array
        int[] arr={4,6,8,9,8,10};
        for(int i=arr.length-1;i>=0;--i){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.commomElements();
    }
}
