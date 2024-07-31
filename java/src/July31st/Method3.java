package July31st;

public class Method3 {
    //16.	int reminder(int, int) - find remainder and return
    static int reminder(int a,int b){
        int result = a % b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reminder(100,6));
    }
}
