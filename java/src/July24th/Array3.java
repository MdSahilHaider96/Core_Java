package July24th;

public class Array3 {
    public static void main(String[] args) {
        int b[]={5,2,5,2,52,};
            b[3]=24;
            System.out.println(b[3]);
        // increment the array using controlled loop (for)
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]++);
        }
        for(int x:b){
            System.out.println(x);
        }
    }
}
