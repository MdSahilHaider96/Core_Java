package August24th;

public class Method8 {
    //8.	int sum(int[]), find sum of all elements of an array and return sum
    void sum(int[] num ){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=num[i]+sum;
        }
        System.out.println("Sum : "+sum);
    }

    public static void main(String[] args) {
        Method8 method8 = new Method8();
        method8.sum(new int[]  {8,5,2});
    }
}
