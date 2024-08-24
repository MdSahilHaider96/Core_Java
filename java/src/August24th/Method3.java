package August24th;

public class Method3 {
    //	3.	void printEven(int[]), method will print all even number from supplied array
    void printEven(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Method3 method3 = new Method3();
        method3.printEven(new int[]{8,47,66,20,-10});
    }
}
