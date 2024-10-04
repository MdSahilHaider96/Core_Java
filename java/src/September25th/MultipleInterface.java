package September25th;

public class MultipleInterface implements Train,Car{

    @Override
    public void car() {
        System.out.println("Mahindra Thar");
    }

    @Override
    public void indianRailway() {
        System.out.println("RAILWAY");
    }
}


