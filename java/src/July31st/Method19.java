package July31st;

public class Method19 {
    //int[] addTwoArrays(int[], int[]) - all array of same size add two supplied
    // arrays elements and then copy the some of each element to 3rd array and return 3rd array.
    public void addTwoArrays(){
        int[] a={3,45,5,5};
        int[] b={4,6,8,8};
        int[] c= new int[a.length+b.length];
        int temp;
        for(int i=0,k=0;i<a.length;i++,k++){
          c[k]=a[i];
        }
        for(int i=0,k=c.length-a.length;i<b.length;i++,k++){
            c[k]=b[i];
        }
        for(int p:c){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Method19 obj =new Method19();
        obj.addTwoArrays();
    }
}
