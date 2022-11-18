package home_work4.shape;

public class Main {

    private static Shape[] generateShapes() {
        Shape[] shapes = new Shape[25];

        for (int i = 0;i < shapes.length / 5  ; i++) {
            shapes[i] = new Square(3);
        }

        for (int i = shapes.length / 5;  i <  ((2* shapes.length)/5); i++ ) {
            shapes[i] = new Rectangle(2,6);
        }

        for (int i = ((2* shapes.length)/5); i < (3*shapes.length)/5; i++) {
            shapes[i] = new Circle(3);
        }

        for (int i = (3*shapes.length)/5;i < (4*shapes.length)/5;i++) {
            shapes[i] = new Triangle(4,3);

        }

        for (int i = (4*shapes.length)/5;i < shapes.length;i++) {
            shapes[i] = new Parallelogram(4,8);
        }

        return shapes;
    }

    public static void main(String[] args) {
        double totalArea = 0;

        for (Shape item : generateShapes()) {
            totalArea = totalArea + item.getArea();
            System.out.println(item.getArea());
        }
        System.out.println(totalArea);






    }
}
