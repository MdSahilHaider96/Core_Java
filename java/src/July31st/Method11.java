package July31st;

public class Method11 {
    //int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0}; count number of zeros and return
    public void countZero(){
        int sum =0;
        int[] a= {1,0,1,0,0,1,1,0};
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Method11 obj = new Method11();
        obj.countZero();
    }
}
