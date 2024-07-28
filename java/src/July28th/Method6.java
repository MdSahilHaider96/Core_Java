package July28th;

public class Method6 {
    //int reminder(int, int) - find remainder and return
    public  int reminder (int x,int y){
        int result=x%y;
        return result;
    }
    public static void main(String[] args) {
    Method6 obj= new Method6();
        System.out.println(obj.reminder(9,5));

    }
}
