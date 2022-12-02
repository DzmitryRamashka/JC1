package home_work7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;

        Scanner scan = new Scanner(System.in);

        Zoo greenZoo = new Zoo("Green Zoo");

        greenZoo.add(new Shark("Jessy","female",2));
        greenZoo.add(new Swift("Billy","male",1));
        greenZoo.add(new Squirrel("Viky","female", 1));
        greenZoo.showListAnimals();

        System.out.println("Please enter a number from list above to see how animal behave:");
        id = scan.nextInt();

        greenZoo.showExactAnimal(id);



    }
}
