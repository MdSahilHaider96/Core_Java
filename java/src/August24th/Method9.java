package August24th;

public class Method9 {
    //9.	double average(int[]), find the average of array elements and return average
    void average(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=num[i]+sum;
        }
        double average = sum / num.length;
        System.out.println("Average of Array Elements : "+ average);
    }

    public static void main(String[] args) {
        Method9 method9 = new Method9();
        method9.average(new int[]{20,20});
    }
}
