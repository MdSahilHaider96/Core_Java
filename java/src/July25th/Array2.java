package July25th;

public class Array2 {
    //02) 	wap to create and print array using loop
    public static void main(String[] args) {
        int[] a ={7,2,1,4,5,3,2};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" , ");
        }
        // for each loop
        for(int x:a){
            System.out.println(x);
        }
    }
}
