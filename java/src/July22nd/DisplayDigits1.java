package July22nd;

public class DisplayDigits1 {
    //Display Digits
    public static void main(String[] args) {
        int n=257;
        while(n>0){
            int r=n%10;
            n=n/10;
            System.out.println(r);
        }

    }
}
