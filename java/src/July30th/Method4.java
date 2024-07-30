package July30th;

public class Method4 {
    //8.	int sum(int[]), find sum of all elements of an array and return sum
    public void  arraySum(){
        int[] a={4,32,5,6,7,8};
        int sum=a[0];
        for (int i=1;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Method4 obj = new Method4();
        obj.arraySum();
    }
}
