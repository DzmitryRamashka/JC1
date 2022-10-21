package home_work2;

public class Task2 {
    public static void main(String[] args) {
        printAllVariables();
    }
    private static void printAllVariables() {
        byte byteNumber = 127;
        short shortNumber = 32767;
        int number = 2147483647;
        long bigNumber = 2147483648L;
        float decimal = 0.32f;
        double bigDecimal = 0.33;
        boolean truth = true;
        char letter = 'J';
        String text = "This is new text";

        System.out.println("byte is " + byteNumber);
        System.out.println("short is " + shortNumber);
        System.out.println("int is " + number);
        System.out.println("long is " + bigNumber);
        System.out.println("float is " + decimal);
        System.out.println("double is " + bigDecimal);
        System.out.println("boolean is " + truth);
        System.out.println("char is " + letter);
        System.out.println("String is " + text);
    }
}
