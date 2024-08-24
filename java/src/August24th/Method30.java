package August24th;

public class Method30 {
   //32.	char[] reverse(char[] src), create new array and copy the src array to new array in reverse order
   static void reverseChar(char[] src){
       char[] ch=new char[src.length];
       for (int i=0,k= src.length-1;i<ch.length;i++,k--){
          ch[k]=src[i];
       }
       for (char p: ch){
           System.out.println(p);
       }
   }

    public static void main(String[] args) {
        reverseChar(new char[]{'S','A','H','I','L'});
    }
}
