package July31st;

public class Method10 {
    //	28.	int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1}; count number of times one in array and return count
    public void countOnes(){
        int count=0;
        int[] a={1,2,1,3,2,1,1,1};
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Method10 obj= new Method10();
        obj.countOnes();
    }
}
