package October5th;

public class LambdaMain {
    public static void main(String[] args) {
        int x =14;
        // Lambda Expression
        Lambda lambda = () -> System.out.println("Lambda Class "+x);
        lambda.star();
    }
}
