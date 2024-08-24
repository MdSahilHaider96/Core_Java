package August24th;

public class Method6 {
    //6.	void copy(int[], int[]), copy first array to second array
    void copy(int[] arr1){
        int[] arr2=new int[arr1.length];
        for (int i=0,k=0;i< arr1.length;i++,k++){
            arr2[k]=arr1[i];
        }
        for(int x: arr2){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Method6 method6 = new Method6();
        method6.copy(new int[]{8,5,3,4,8});
    }
}
