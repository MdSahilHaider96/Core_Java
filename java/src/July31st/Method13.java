package July31st;

public class Method13 {
    //31.	int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
    // create an array having the count of zero and one in given array, return zero and one
    public void countOneZero(){
        int[] a = {1,0,1,0,0,1,1};
        int count=0;
        int count2=0;
        for (int i=0;i<a.length;i++){
               if(a[i]==0){
                   count++;
               }
            if(a[i]==1){
                count2++;
            }
          }
        System.out.println(count + " times  : 0");
        System.out.println(count2 +" times  : 1");
        }

    public static void main(String[] args) {
        Method13 obj = new Method13();
        obj.countOneZero();

    }
}



