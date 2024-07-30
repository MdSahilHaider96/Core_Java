package July30th;

public class Method2 {
        public void copyArray(){
        int[] a={4,5,76,7,8,9};
        int[] b= new int[a.length];
        for(int i=0,k=0;i<a.length;i++,k++){
            b[k]=a[i];
        }
        for (int x:b){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Method2 obj=new Method2();
        obj.copyArray();
    }
}
