package July22nd;

public class Armstrong {
    public static void main(String[] args) {
        int n=1353;
        int sum=0;
        int m=n;
        while(n>0){
            int r=n%10;
             sum=sum+r*r*r;
            n=n/10;
        }
    if (sum==m){
        System.out.println("it is armstrong number");
    }
    else if (sum!=m){
        System.out.println("It is not a Armstrong Number");
    }
    }
}
