package July30th;

public class Method6 {
    //10.	int greatest(int[]), find greatest element of an array and return that greatest value
    public void arrayGreatest(){
       int[] a= {88, 93, 3, 4};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Method6 obj= new Method6();
        obj.arrayGreatest();
    }
}
