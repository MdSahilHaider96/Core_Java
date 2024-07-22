package July21st;

public class loopadsd
{
    public static void main(String[] args) {
            //wap to print all numbers between 30 to 50 those are not divisible by 7
        int n=50;
        for (int i = 30; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i++);
            }
        }
    }

        }


