package August24th;

public class Method11 {
    //11.	int smallest(int[]), find smallest element of an array and return that smallest value
    void smallest(int[] num){
        int min =num[0];
        for (int i=0;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Method11 method11= new Method11();
        method11.smallest(new int[] { -99,54,22,10,-4});
    }
}
