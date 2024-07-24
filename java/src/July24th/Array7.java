package July24th;

public class Array7 {
    public static void main(String[] args) {
        int a[]={2,7,4,3,7};
        int key=7;
        // Searching ;
        for(int i=0;i<a.length;i++){
            if(key==a[i]){
            System.out.println(i);
            System.exit(0 );
            }
        }
        System.out.println("Not found");
    }
}
