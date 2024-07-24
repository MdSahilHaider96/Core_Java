package July24th;

public class Array9 {
    public static void main(String[] args) {
        int a[]={34,2,67,43,2};
        //search max element
        int max =a[0];
        for(int i=0;i<a.length;i++){
        if(max<a[i]){
            max=a[i];
        }
        }
        System.out.println(max);
    }
}
