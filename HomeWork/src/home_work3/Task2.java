package home_work3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int n = scan.nextInt();
        while (n < 0) {
            System.out.println("Please enter a positive number:");
            n = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d ",n,sum);
    }
}
