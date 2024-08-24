package August24th;

public class Method10 {
    //10.	int greatest(int[]), find greatest element of an array and return that greatest value
    void greatest(int[] num){
        int max= num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Method10 method10= new Method10();
        method10.greatest(new int[]{7,5,99,10});
    }
}
