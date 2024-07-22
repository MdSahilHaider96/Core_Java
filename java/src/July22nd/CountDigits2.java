package July22nd;

public class CountDigits2 {
    public static void main(String[] args) {
        int count=0;
        int n=456;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
