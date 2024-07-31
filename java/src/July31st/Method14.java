package July31st;

public class Method14 {
    //char[] reverse(char[] src), create new array and copy the src array to new array in reverse order
    public void reverseChar(){
        char[] c={'l','i','h','a','S'};
        char[] a= new char[c.length];
        char temp;
        for(int i=c.length-1,k=0;i>=0;i--,k++){
            temp=c[i];
            a[k]=temp;
        }
        for(char x:a){
            System.out.println(x);
        }
//      reverse array  for(int i=c.length-1;i>=0;i--){
//            System.out.print(c[i]);
//        }
    }

    public static void main(String[] args) {
        Method14 obj= new Method14();
        obj.reverseChar();
    }
}
