package July24th;

public class Array11 {
    public static void main(String[] args) {
        int a[] = {58, 22, 12, 34, 155};
        // Second largest Array
        int max1 ;
        int max2 ;
        max1=max2=a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println("Second largest Element : "+ max2);
}

}
