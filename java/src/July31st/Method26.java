package July31st;

public class Method26 {
    //48.	double sumOfArray(double[]) sum of all elements of given array and return the sum
    public void sumOfArray(){
        double[] a={9,3,1,4.5,5.0};
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Method26 obj = new Method26();
        obj.sumOfArray();
    }
}
