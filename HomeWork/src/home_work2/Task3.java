package home_work2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        String template = "Java automation";
        String startWith = "Java";
        String endWith = "automation";
        String find = "auto";
        String add = " QA";
        String replace = "C#";

        System.out.println("Enter the name of your course:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        textLength(text);
        textEmpty(text);
        textCharAt(text);
        textEquals(text,template);
        textIgnoreEquals(text,template);
        textStartsWith(text,startWith);
        textEndsWith(text,endWith);
        textContain(text,find);
        textConcat(text,add);
        textReplace(text,startWith,replace);
        textLowCase(text);
        textFormat(text);
    }
    private static void textLength(String text) {
        System.out.println("Length of text is " + text.length());
    }
    private static void textEmpty(String text) {
        System.out.println("Text is empty.True or false? : " + text.isEmpty());
    }

    private static void textCharAt(String text) {
        System.out.println("Char in the last position of your text is " + text.charAt(text.length()-1) );
    }

    private static void textEquals(String text,String template) {
        System.out.println("Your text is equal to " + template + " with case.True or false? : " + text.equals(template));
    }

    private static void textIgnoreEquals(String text,String template) {
        System.out.println("Your text is equal to " + template + " ignoring case.True or false? : " + text.equalsIgnoreCase(template));
    }

    private static void textStartsWith(String text,String startWith) {
        System.out.println("Your text starts with " + startWith + ".True or false? : " + text.startsWith(startWith));
    }

    private static void textEndsWith(String text,String endWith) {
        System.out.println("Your text ends with " + endWith + ".True or false? : " +text.endsWith(endWith) );
    }

    private static void textContain(String text, String find) {
        System.out.println("Your text contains " + find + ".True or false? : " + text.contains(find));
    }

    private static void textConcat(String text, String add) {
        System.out.println("Your text is concat with " + add + " into " + text.concat(add));
    }

    private static void textReplace(String text,String startWith,String replace) {
        System.out.println("Your text is replaced with " + replace + " into " + text.replace(startWith,replace));
    }

    private static void textLowCase(String text) {
        System.out.println("Your text in the lower case is " + text.toLowerCase());
    }

    private static void textFormat(String text) {
        System.out.println("Your text as variable for formatted String is " + String.format("I'm attending %s",text));
    }


















}
