package home_work3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        printScore();
    }
    private static void printScore() {
        System.out.println("Please enter your score from 0 to 100:");
        int score = new Scanner(System.in).nextInt();
        while ( (score < 0) || (score > 100) ) {
            System.out.println("You score is less than 0 or greater than 100");
            System.out.println("Please enter your score from 0 to 100 again:");
            score = new Scanner(System.in).nextInt();
        }
        if (score >= 70) {
            System.out.println("Congrats! You've passed the test!");
        }
        else {
            System.out.println("Sorry. You've failed the test.");
        }




    }


}



