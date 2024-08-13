package August12th;

public class Add5 {
    //wap to add 5 to each element of an array
    public static void main(String[] args) {
        int[] arr={3,4,56,7};
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
