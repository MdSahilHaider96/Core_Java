package July31st;

public class Method12 {
    //30.	int checkChar(char c), return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
    public void checkChar(char c){
        if (c=='C'){
            System.out.println("1");
        }
        else if(c=='c'){
            System.out.println("-1");
        }
        else System.out.println("Not Match any of them");
    }

    public static void main(String[] args) {
        Method12 obj = new Method12();
        obj.checkChar('D');
    }
}
