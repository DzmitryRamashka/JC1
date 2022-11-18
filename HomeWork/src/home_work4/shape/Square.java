package home_work4.shape;

public class Square implements Shape {
    private double length;

    public Square() {
        length = 0;
    }

    public Square(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {
        return length*length;
    }







}
