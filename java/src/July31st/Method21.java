package July31st;

public class Method21 {
    // 38.	char[] stringToArray(String), convert string to char array and return that array
    public void stringToCharArray(){
        String str="SAHIL";
        char[] a=new char[str.length()];
        for(int i=0;i<str.length();i++){
            a[i]=str.charAt(i);
        }
        for(char p:a){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Method21 obj= new Method21();
        obj.stringToCharArray();
    }
}
