package July23rd;

public class pattern2 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=0;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
}
