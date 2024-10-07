package October5th;

public class LambdaWithArgsMain {
    public static void main(String[] args) {
        LambdaWithArgs lambdaWithArgs =(name) -> System.out.println("Name : "+name);
        lambdaWithArgs.display("Sahil");
        lambdaWithArgs.display("Haider");
    }
}
