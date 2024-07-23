package July23rd;

public class GpSeries {
    public static void main(String[] args) {
        //Geometric Progression
        int a=10; // starting number;
        int d=5;// diffrence
        int r= 2;// ratio
        int s=5;
        int term=a;
            for(int i=0;i<s;i++){
               term=term*r;
                System.out.println(term);
            }

    }
}
