package July23rd;

public class NestedLoop4 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=5;i++){
            for (int j=1;j<=5;j++){
                ++count;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }
    }
}
