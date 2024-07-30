package July30th;

public class Method3 {
    //int[] copy(int[]), create an array and copy supplied array and return that new array
    public void copyArray(){
        int[] a= {4,5,7,9,2,6,9};
        int[] b= new int[a.length];
        int count=0;
        for(int i=0,k=0;i<a.length;i++,k++){
            b[k]=a[i];
            System.out.println(count++ +" : "+b[k]);
        }
    }

    public static void main(String[] args) {
        Method3 obj=new Method3();
        obj.copyArray();
    }
}

