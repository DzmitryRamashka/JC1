package home_work3;

import java.util.Scanner;

public class Task4 {
    private static String [] channels = {"Main CH1","Second 2","THRD 3","RETRO 4","Five 5","Six 6","Seven 7","Eight 8","9 Channel"};

    public static void main(String[] args) {

        System.out.printf("Enter a number of channel from 1 to %d or 0 to exit\n",channels.length);
        Scanner scan = new Scanner(System.in);
        int channel = scan.nextInt();
        while(channel != 0) {
            if ((channel  > 0) && (channel <= channels.length) ) {
                System.out.println("Your choice is " + channels[channel - 1]);
            } else {
                System.out.println("There is no such channel now");
            }
            System.out.println("==============================");
            System.out.printf("Enter a number of next channel from 1 to %d or 0 to exit\n",channels.length);
            channel = scan.nextInt();
        }
        System.out.println("Bye-bye");
    }
}
