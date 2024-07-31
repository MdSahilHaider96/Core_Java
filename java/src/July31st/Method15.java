package July31st;

public class Method15 {
    //char[] reverse(char[] src), reverse the same array and return.
    public void reverseChar(){
        char[] a={'S','a','h','i','l'};
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Method15 obj=new Method15();
        obj.reverseChar();
    }
}

