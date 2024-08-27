package August27th;

public class ArrayOperationsClassMain {
    public static void main(String[] args) {
        ArrayOperationsClass arrayOperationsClass  = new ArrayOperationsClass();
        arrayOperationsClass.reverseArray(new int[]{7,6,5,3});
        arrayOperationsClass.findMin(new int[]{7,6,-5,-3});
        arrayOperationsClass.findMax(new int[]{79,6,-5,-3});
        arrayOperationsClass.countPositive(new int[]{7,6,-5,-3});
        arrayOperationsClass.countNegative(new int[]{7,6,-5,3});
        arrayOperationsClass.sumArray(new int[]{7,6,-5,-3});
        arrayOperationsClass.addTwoArrays(new int[]{7,6,-5,-3},new int[]{70,60,50,30});
        arrayOperationsClass.copyArray(new int[]{7,6,75});
        arrayOperationsClass.arrayPrint(new int[]{7,6,-5,-3});
        arrayOperationsClass.arrayPrint(new int[]{10,52,45,10});
    }
}
