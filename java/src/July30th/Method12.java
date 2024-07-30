package July30th;

public class Method12 {
    //11.	int smallest(int[]), find smallest element of an array and return that smallest value
    public void smallArray(){
        int[] a={4,6,2,1,-57,8};
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Method12 obj= new Method12();
        obj.smallArray();

    }
}
