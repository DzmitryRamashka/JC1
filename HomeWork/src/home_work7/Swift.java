package home_work7;

public class Swift extends Bird{
    private final String species = "Swift";

    private String name;

    private String sex;
    private int age;

    public Swift() {

    }

    public Swift(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void breathe() {
        System.out.println("I breathe like a swift");
    }

    @Override
    public void move() {
        System.out.println("I move like a swift");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I often fly like a bird ");
    }

    public void fastFly() {
        System.out.println("I fly like a swift with maximum velocity");
    }

    @Override
    public String toString() {

        return species;
    }
}
