package home_work3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);

        while (!str.equals("Exit")) {
            System.out.println("Please enter something:");
            str = scanner.nextLine();
        }
    }
}
