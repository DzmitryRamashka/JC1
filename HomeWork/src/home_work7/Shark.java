package home_work7;

public class Shark extends Fish{
    private final String species = "Shark";

    private int id;
    private String name;

    private String sex;
    private int age;



    public Shark() {

    }

    public Shark(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public void breathe() {
        System.out.println("I breath under water like a shark");
    }

    @Override
    public void move() {
        System.out.println("I swim under water like a shark");
    }

    @Override
    public String toString() {

        return species;
    }

    public void patrol() {
        System.out.println("I patrol the water like a shark");
    }


}
