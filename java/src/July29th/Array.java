package July29th;

public class Array {
    public static void main(String[] args) {
        int[] a={3,5,67,9,10};
        int[] b={7,3,2,45,99};
        int[] c= new int[a.length+b.length];
        int x=0;// for index of c
        int count=0;
         for(int i=0;i<a.length;i++){
             c[x]=a[i];
             x++;
         }
         for (int i=0;i<a.length;i++){
             c[x]=b[i];
             x++;
         }
         for(int p:c){
             System.out.println(count++ + " : "+p);
         }
    }
}
