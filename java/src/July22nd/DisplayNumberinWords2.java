package July22nd;

public class DisplayNumberinWords2 {
    public static void main(String[] args) {
        int n=765;
        int r;
        String str="";
        while (n>0){
            r=n%10;
            n=n/10;
            str=str+r;
        }
        char c;
    for(int i=str.length()-1;i>=0;i--){
        c=   str.charAt(i);
       switch (c) {
           case '0':
               System.out.println("Zero");
               break;
           case '1':
               System.out.print(" One ");
               break;
           case '2':
               System.out.print(" two ");
               break;
           case '3':
               System.out.print(" three ");
               break;
           case '4':
               System.out.print(" Four");
               break;
           case '5':
               System.out.print(" Five");
               break;
           case '6':
               System.out.print(" Six");
               break;
           case '7':
               System.out.print(" Seven");
               break;
           case '8':
               System.out.print(" Eight");
               break;
           case '9':
               System.out.print(" Nine");
               break;
       }
    }
    }
}
