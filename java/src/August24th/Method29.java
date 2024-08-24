package August24th;

public class Method29 {
    //29.	int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0}; count number of zeros and return
    static void countZero(int num){
        int[] arr={1,0,1,0,0,1,1,0};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countZero(0);
    }
}
