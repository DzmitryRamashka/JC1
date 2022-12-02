package home_work7;

public class Fish implements Animal {
    private final String type = "Fish";


    @Override
    public void breathe() {
        System.out.println("I breath under water like a fish");
    }

    @Override
    public void move() {
        System.out.println("I swim under water like a fish");;
    }


}
