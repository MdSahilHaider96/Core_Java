package August24th;

public class Method2 {
    //2.	void printPositive(int[]), method will print all positive number from supplied array
    void printPositive(int[] num){
        int temp=0;
        for (int i=0;i<num.length;i++){
            if(num[i]>0){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        Method2 method2 = new Method2();
        method2.printPositive(new int[] {84,65,-89,-99,20});
    }
}
