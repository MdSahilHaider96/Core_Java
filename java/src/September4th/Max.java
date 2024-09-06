package September4th;

public class Max {
    int max(int x , int y){
        return  x>y?x:y;
    }

    public static void main(String[] args) {
        Max   max = new Max();
        System.out.println(max.max(10,9));
    }
}
