package July22nd;

public class CountDigits {
    public static void main(String[] args) {
        int count=1;
        int n=243;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
