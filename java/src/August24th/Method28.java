package August24th;

public class Method28 {
    //28.	int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1}; count number of times one in array and return count
    static void countOnes(){
        int[] arr={1,2,1,3,2,1,1,1};
        int counter=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==1){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countOnes();
    }
}
