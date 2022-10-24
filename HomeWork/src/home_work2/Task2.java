package home_work2;

public class Task2 {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 2147483648L;
        float floatVar = 0.32f;
        double doubleVar = 0.33;
        boolean booleanVar = true;
        char charVar = 'J';
        String stringVar = "This is new text";

        printByte(byteVar);
        printShort(shortVar);
        printInt(intVar);
        printLong(longVar);
        printFloat(floatVar);
        printDouble(doubleVar);
        printBoolean(booleanVar);
        printChar(charVar);
        printString(stringVar);
    }
    private static void printByte(byte byteVar) {
        System.out.println("byte is " + byteVar);
    }
    private static void printShort(short shortVar) {
        System.out.println("short is " + shortVar);
    }
    private static void printInt(int intVar) {
        System.out.println("int is " + intVar);
    }
    private static void printLong(long intLong) {
        System.out.println("long is " + intLong);
    }
    private static void printFloat(float floatVar) {
        System.out.println("float is " + floatVar);
    }
    private static void printDouble(double doubleVar) {
        System.out.println("double is " + doubleVar);
    }
    private static void printBoolean(boolean booleanVar) {
        System.out.println("boolean is " + booleanVar);
    }
    private static void printChar(char charVar) {
        System.out.println("char is " + charVar);
    }
    private static void printString(String stringVar) {
        System.out.println("String is " + stringVar);
    }









}
