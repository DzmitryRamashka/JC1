package basic;

public class Main {
    public static void main(String[] args) {
        testPrint("Hello, Java!");
    }

    private static void testPrint(String text) {
        if (!isFirstApp()) {
            System.out.println("This is the first " + text + " application");
        }
        else {
            System.out.println("This is not the first " + text + " application");
        }
    }

    private static boolean isFirstApp() {
        return true;
    }
}




