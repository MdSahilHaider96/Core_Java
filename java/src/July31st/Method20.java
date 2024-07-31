package July31st;

public class Method20 {
    // char[] To String[]
   public void charToString(){
       char[] a ={'A','B','C'};
       String[] b = new String[a.length];
       for(int i=0,k=0;i<a.length;i++,k++){
           b[k]=String.valueOf(a[i]);
       }
       for(String p:b){
           System.out.println(p);
       }
   }

    public static void main(String[] args) {
        Method20 obj= new Method20();
        obj.charToString();
    }
}
