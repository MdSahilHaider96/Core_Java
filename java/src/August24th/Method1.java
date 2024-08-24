package August24th;

public class Method1 {
    //1.	void printNegative(int[]), method will print all negative number from supplied array
        public static int Negativenum(int[] array) {
            int temp = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    System.out.println(array[i]);
                }

            }
            return temp;
        }

    public static void main(String[] args) {
        Negativenum(new int[] {100,-100,-9,99});
    }
}



