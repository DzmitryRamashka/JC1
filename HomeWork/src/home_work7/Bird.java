package home_work7;

public class Bird implements Animal , Flying{
    private final String type = "Bird";

    @Override
    public void breathe() {
        System.out.println("I can breath in the flight like a bird");
    }
    @Override
    public void move() {
        System.out.println("I move like a bird");
    }

    @Override
    public void fly() {
        System.out.println("I fly like a bird");
    }
}
