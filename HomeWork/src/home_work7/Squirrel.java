package home_work7;

public class Squirrel extends Mammal {
    private final String species = "Squirrel";
    private int id;
    private String name;

    private String sex;
    private int age;

    public Squirrel() {

    }

    public Squirrel(String name,String sex,int age) {

        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void breathe() {
        System.out.println("I breathe in the air like a squirrel");
    }

    @Override
    public void move() {
        System.out.println("I move like a squirrel");
    }

    @Override
    public String toString() {

        return species;
    }

    public void stash() {
        System.out.println("I stash nuts and seeds");
    }

}
