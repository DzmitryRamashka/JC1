package home_work8;

public class Main {
    public static void main(String[] args) {
        String text;

        Calculator calc = new Calculator();


        System.out.println(calc.getResult());
        System.out.println(calc.addByNumber(4.4));
        System.out.println(calc.subtractByNumber(2.4));
        System.out.println(calc.divideByNumber(4));
        System.out.println(calc.multiplyByNumber(1000));
        System.out.println(calc.cancelResult());
        System.out.println(calc.divideByNumber(4));
        System.out.println(calc.addByNumber(4.4));
        System.out.println(calc.addByNumber(4.4));
        System.out.println(calc.add(3,4));
        System.out.println(calc.multiplyByNumber(10));
        calc.divideByNumber(0.0);
        calc.divide(2,0);
        System.out.println(calc.multiply(5,3));



        System.out.println(0f/0.0);




    }
}
