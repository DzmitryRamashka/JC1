package home_work7;

import java.util.ArrayList;

public class Zoo {
    private String name;
    private ArrayList <Animal> listAnimals = new ArrayList<>();

    public Zoo() {

    }

    public Zoo(String name) {
        this.name = name;
    }

    public void add(Animal animal) {
        listAnimals.add(animal);
        System.out.println("Animal is added");

    }

    public  void showListAnimals() {
        for (int i = 0; i < listAnimals.size();i ++) {
            System.out.print(i + ":");
            System.out.println(listAnimals.get(i));

        }
    }

    public void showExactAnimal(int id) {
        System.out.println("=============");
        System.out.println(listAnimals.get(id));
        listAnimals.get(id).move();
        listAnimals.get(id).breathe();
    }

    }


