package October9th;

public class ArithmeticException2 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int i=5/0;
            System.out.println("i : "+ i);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("This willl always execute ");
        }
        System.out.println("end");

    }
    }

