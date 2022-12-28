package home_work10;

import helpers.FileHelper;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("show me how to test");

        String filePath = "d:\\lyrics.txt";

        FileHelper.writeToFile(filePath,"i need an easy friend\n");
        FileHelper.appendToFile(filePath,"i do, with an ear to lend");
        System.out.println(FileHelper.readFile(filePath));




    }
}
