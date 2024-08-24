package August24th;

public class Method7 {
    //7.	int[] copy(int[]), create an array and copy supplied array and return that new array
    void copyArray(int[] arr ) {
        int[] arr2 = {8, 5, 9, 10};
        int[] arr3 = new int[arr.length + arr2.length];
        int x= 0; // temp counter
        for(int i =0;i<arr.length;i++){
            arr3[x]=arr[i];
            x++;
        }
        for (int i=0;i< arr2.length;i++){
            arr3[x]=arr2[i];
            x++;
        }
        for(int p:arr3){
            System.out.println(p);
        }

    }
    public static void main(String[] args) {
        Method7 method7= new Method7();
        method7.copyArray(new int[]{1,2,3});
    }
}
