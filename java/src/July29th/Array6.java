package July29th;

public class Array6 {
    public static void main(String[] args) {
        int[] a={3,4,2,1,4};
        int[] b={9,7,6,54,3};
        int[] c=new int[a.length+b.length];
        int x=0;
        for(int i=0;i<a.length;i++){
            c[x]=a[i];
            x++;
        }
        for (int i=0;i<b.length;i++){
            c[x]=b[i];
            x++;
        }
        for (int p:c){
            System.out.println(p);
        }
    }
}
