package July22nd;

public class DisplayNumberinWords {
    public static void main(String[] args) {
        int rev=0;
        int n=123;
        int r;
        String word="";
        while (n>0){
            r=n%10;;
            n=n/10;
            word=word+r;
        }
        System.out.println(word);
        char c;
        for(int i=word.length()-1;i>=0;i--){
            c=word.charAt(i);
            switch (c){
                case '0': System.out.print("Zero");
                break;
                case '1': System.out.print("One ");
                    break;
                case '2': System.out.print("two ");
                    break;
                case '3': System.out.print("three ");
                    break;
                case '4': System.out.print("Four");
                    break;
                case '5': System.out.print("Five");
                    break;
                case '6': System.out.print("Six");
                    break;
                case '7': System.out.print("Seven");
                    break;
                case '8': System.out.print("Eight");
                    break;
                case '9': System.out.print("Nine");
                    break;

                        }
        }


    }
}
