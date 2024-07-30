package July30th;

public class Method5 {
    //9.	double average(int[]), find the average of array elements and return average
    public void arrayAverage(){
        double[] a={6,3,6,8,8};
        double sum=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>sum){
                sum=sum+a[i];
            }
        }
        double avegage=sum/a.length;
        System.out.println(avegage);
    }

    public static void main(String[] args) {
        Method5 obj = new Method5();
        obj.arrayAverage();
    }
}
