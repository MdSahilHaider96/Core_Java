package October5th;

public class LambdaWithDoubleArgsMain {
    public static void main(String[] args) {
        LambdaWithDoubleArgs lambdaWithDoubleArgs = (a,name) ->{
            System.out.println("id : "+a+" Name  : "+name);
            System.out.println("id : "+a+" Name  : "+name);
        };
        lambdaWithDoubleArgs.print(10,"Sahil");
    }
}
