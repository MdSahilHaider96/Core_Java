package August24th;

public class Method12 {
    //12.	int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2, copy first array and second array to two third array.
 void copyArray(int[] arr1 , int[] arr2 ){
     int[] arr3 = new int[arr1.length+ arr2.length];
     int x=0;
     for (int i=0;i<arr1.length;i++){
         arr3[x]=arr1[i];
         x++;
     }
     for (int i=0;i<arr2.length;i++){
         arr3[x]=arr2[i];
         x++;
     }
     for (int p :arr3){
         System.out.println(p);
     }
 }

    public static void main(String[] args) {
        Method12 method12 = new Method12();
        method12.copyArray(new int[]{8,5,12,1},new int[]{96,45});
    }
}