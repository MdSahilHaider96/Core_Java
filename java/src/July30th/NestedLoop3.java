package July30th;

public class NestedLoop3 {
    public static void main(String[] args) {
        // first loop m= index(down |)
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(i+j+" ");
            }
            System.out.println("");
        }
    }
}
