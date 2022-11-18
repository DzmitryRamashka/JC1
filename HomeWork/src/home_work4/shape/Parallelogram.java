package home_work4.shape;

public class Parallelogram implements Shape {
    private double height;
    private double base;

    public Parallelogram(double height,double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height*base;
    }
}
