package August24th;

public class Method4 {
//	4.	void printOdd(int[]), method will print all odd number from supplied array
    void printOdd(int[] arr){
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Method4 method4 = new Method4();
        method4.printOdd(new int[] {99,54,22,63,-3,-72});
    }
}
