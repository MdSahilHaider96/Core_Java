package July25th;

public class Array16 {
    public static void main(String[] args) {
        // 12) 	wap to copy an array to another array in reverse order
        int[] a={2,4,5,42,7};
        int temp=0;
        //       0 1 2  3  4
       // System.out.println(a.length);
        int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--) {
            temp=a[i];
          System.out.println(a[i]);
             }
        System.out.println(temp);
        }

    }


