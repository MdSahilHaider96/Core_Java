package August24th;

public class Method31 {
    //33.	char[] reverse(char[] src), reverse the same array and return.
    static  void reverseChar(char[] src){
        char temp;
        for(int i= src.length-1;i>=0;i--){
            System.out.println(src[i]);
        }

    }
    public static void main(String[] args) {
     reverseChar(new char[]{'S','A','H','I','L'});
    }
}
