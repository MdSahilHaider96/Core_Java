package Interview;

public class BreakLoopOn7 {
    public static void main(String[] args) {
        //31.	wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.
        for (int i = 0;i<10;i++){
            if (i==7){
                System.out.println(i);
                break;
            }
        }
    }
}
