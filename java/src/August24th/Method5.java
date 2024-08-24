package August24th;

public class Method5 {
    //5.	void printNum(int[], int), method will print number if found in array from supplied array
    //		e.g. if a[]={1,2,3} n b=2 then print 2
    //		if a[]={1,2,3} n b=5 then print not found, here 5 is not an array element
    void printNum(int[] arr , int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Method5 method5 = new Method5();
        method5.printNum(new int[]{5,14,17,8,6,2,5},14);
    }
}
