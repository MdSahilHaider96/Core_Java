package July24th;

public class Array5 {
    public static void main(String[] args) {
        int a []={62,24,55};
        //printing ARray using for loop
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        //printing array using for each
        for(int x:a){
            System.out.println(x);
        }
        //reverse array
        for(int i=a.length-1;i>=0;--i){
            System.out.println("reverse array : "+a[i]);
        }
    }
}
