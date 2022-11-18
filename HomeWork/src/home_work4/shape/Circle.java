package home_work4.shape;

public class Circle implements Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI*Math.pow(radius,2);
    }



}
