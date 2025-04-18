package Interview;

public class factorialOf6 {
    public static void main(String[] args) {
        int num = 6;
        int fact = 1;
        for (int i = 1 ;i <=num;i++){
            if (num != 0){
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}
