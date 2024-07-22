package July22nd;

public class palindrome1 {
    public static void main(String[] args) {
        int n=1231;
        int rev=0,r;
        int m=n;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (rev==m){
            System.out.println(m+"  is a palindrome ");
        }
        else System.out.println(m+"  not a palindrome Number");
    }
    }

