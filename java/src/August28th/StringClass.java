package August28th;

public class StringClass {
    public static void main(String[] args) {
        //String Class
        String string = new String("sahil");
        System.out.println(string);
        String s = "Haider";
        System.out.println(s);
        //toUpperCase and toLowerCase
        System.out.println("uppercase : " + s.toUpperCase());
        System.out.println("uppercase : " + string.toUpperCase());
        System.out.println("Lowercase : " + s.toLowerCase());
        //CharAt
        char c = s.charAt(2);
        System.out.println(c);
        //SubString
        String sub = string.substring(2);
        System.out.println(sub);
        String sub2 = s.substring(1, 4);
        System.out.println(sub2);
        //Equals Method
        boolean a = s.equals("haider");
        System.out.println(a);
        // Equals Ignore Case
        a = s.equalsIgnoreCase("haider");
        System.out.println(a);
        //HashCode
        Integer i = 78;
        int hashvalue = i.hashCode();
        System.out.println("Normal Integer Printing : "+i);
        System.out.println("HashValue : "+hashvalue);

    }
    // REverse STring
    public void reverseString(String str){
        char[] c = str.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
    }
    public void reverse(String s){
       char[] ch = s.toCharArray();
       char[] reverse= new char[ch.length];
       for (int i= ch.length-1,k=0;i>=0;i--,k++){
           reverse[k]=ch[i];
       }
        System.out.println(reverse.toString()); // Not Working
    }
}
