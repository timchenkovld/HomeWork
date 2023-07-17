package homework;

public class Main {
    public static void main(String[] args) {
        ShapeHelper shapeHelper = new ShapeHelper();
        shapeHelper.shapeInfo(new Circle());
        shapeHelper.shapeInfo(new Quad());
        shapeHelper.shapeInfo(new Rectangle());
        shapeHelper.shapeInfo(new Oval());
        shapeHelper.shapeInfo(new Rhombus());
    }
}