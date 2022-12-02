package home_work7;

public class Mammal implements Animal {

    private final String type = "Mammal";


    @Override
    public void breathe() {
        System.out.println("I breath in the air like a mammal");
    }

    @Override
    public void move() {
        System.out.println("I move like a mammal");
    }

}
