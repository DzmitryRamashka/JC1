package home_work3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int choice = -1;
        String firstName = "";
        String secondName = "";
        int birthYear = 0;
        int edgeYear = 1900;

        Scanner scan = new Scanner(System.in);

        menu();

        while (choice != 0) {
            System.out.println("===============================");
            System.out.println("Enter a number from menu above:");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name");
                    firstName = scan.next();
                    break;
                case 2:
                    System.out.println("Enter second name");
                    secondName = scan.next();
                    break;
                case 3:
                    System.out.println("Enter birth year");
                    birthYear = scan.nextInt();
                    break;
                case 4:
                    if ( (!firstName.equals("")) && (!secondName.equals("")) && (birthYear > edgeYear) ) {
                        System.out.println("First name is " + firstName);
                        System.out.println("Second name is " + secondName);
                        System.out.println("Birth year is " + birthYear);
                        break;
                    }
                    else {
                        if (firstName.equals("")) {
                            System.out.println("First name is empty");
                        }
                        if (secondName.equals("")) {
                            System.out.println("Second name is empty");
                        }
                        if (birthYear <= edgeYear) {
                            System.out.printf("Birth year should be greater than %d\n", edgeYear);
                        }
                        break;
                    }

            }
        }
    }
    private static void menu() {
        System.out.println("1. Enter first name");
        System.out.println("2. Enter second name");
        System.out.println("3. Enter birth year");
        System.out.println("4. Show personal info");
        System.out.println("0. Exit");
    }
}
