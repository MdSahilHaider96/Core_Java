package July31st;

public class Method27 {
    //49.	int[] firstHalfArray(int[]) split given array in half and
    // sum the of all elements of first half and return sum
  public void sumOfHalfArray(){
      int[] a={4,5,16,7,4,10};
      int sum=0;
      for(int i=0;i<a.length/2;i++){
          sum=sum+a[i];
      }
      System.out.println("Sum of half Array is : "+ sum);
  }

    public static void main(String[] args) {
        Method27 obj = new Method27();
        obj.sumOfHalfArray();
    }
}
