package September25th;

public class AbstracMixExampleImplMain {
    public static void main(String[] args) {
        AbstracMixExample abstracMixExample = new AbstracMixExample() {
            @Override
            public void brand() {
                System.out.println("BRAND");
            }
        };
        abstracMixExample.brand();
        abstracMixExample.display();
    }
}
