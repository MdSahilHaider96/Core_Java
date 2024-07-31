package July31st;

public class Method22 {
    /// 38.	char[] stringToArray(String), convert string to char array and return that array
    public void StringToChar(){
        String str="HAIDER";
        char[] c= new char[str.length()];
        for(int i=0;i<str.length();i++){
            c[i]=str.charAt(i);
        }
        for(char p:c){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Method22 obj = new Method22();
        obj.StringToChar();
    }
}
