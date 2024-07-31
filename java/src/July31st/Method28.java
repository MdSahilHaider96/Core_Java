package July31st;

public class Method28 {
    //50.	double[] secondHalfArray(double[])
    // split given array in half and sum the of all elements of second half and return sum
    public void sumOfHalfArray(){
        double[] d={3.5,5.0,6.5,78,6,8,5,9};
        double sum=0;
        for (int i=0;i<d.length/2;i++){
            sum=sum+d[i];
        }
        System.out.println("Sum of Half Double Array is : "+sum);
    }

    public static void main(String[] args) {
        Method28 obj = new Method28();
        obj.sumOfHalfArray();
    }
}

