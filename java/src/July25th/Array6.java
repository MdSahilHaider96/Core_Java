package July25th;

public class Array6 {
    public static void main(String[] args) {
        //06) 	wap to print only positive number from an array
        int[] a={4,2,-1,3,-3};
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                System.out.println(a[i]);
            }
        }
    }
}
