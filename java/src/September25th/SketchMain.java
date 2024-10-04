package September25th;

public class SketchMain {
    public static void main(String[] args) {
        ShapeClass shapeClass = new TriangleClass();
        shapeClass.draw();
        ShapeClass shapeClass1 = new CircleClass();
        shapeClass1.draw();
        Sketch sketch = new Sketch();
        sketch.trace(shapeClass);
    }
}
