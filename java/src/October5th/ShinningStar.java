package October5th;

public class ShinningStar {
//    //AnonymousClass Example
public static void main(String[] args) {
    SmallStar smallStar = new SmallStar();
    smallStar.size();
    BigStar bigStar = new BigStar();
    bigStar.size();
    // Direct implement the interface in end use " ; "
    Star star = new Star() {
        @Override
        public void size() {
            System.out.println("Shinning Star");
        }
    };
    star.size();
}
}