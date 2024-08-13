package August12th;

public class AverageValue {
    //60. 	Write a Java program to calculate the average value of array elements
    public static void main(String[] args) {
        int[] arr={5,4,9,25,88};
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double average= sum / arr.length;
        System.out.println(average);
    }
}
