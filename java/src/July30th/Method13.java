package July30th;

public class Method13 {
    //12.	int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2,
    // copy first array and second array to two third array.
    public void Copyarray(){
        int[] a= {3,5,78,9};
        int[] b={98,3,5,7,8,1,12};
        int[] c= new int[a.length+b.length];
        int count=0;
        int x=0;// index of new Array c
        for(int i=0;i<a.length;i++){
            c[x]=a[i];
            x++;
        }
        for (int k=0;k<b.length;k++){
            c[x]=b[k];
            x++;
        }
        for(int p:c){
            System.out.println(count++ + " : " + p);
        }
    }

    public static void main(String[] args) {
        Method13 obj= new Method13();
        obj.Copyarray();
    }
}
