import javax.swing.*;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // TODO: 2023-04-24 declare variables (String, Integer)
        String name = "Daniel";
        Integer age = 26;
        String phrase = "Hello, my name is "+name+" and I am "+String.valueOf(age)+" years old.";
        System.out.println(phrase);

        // TODO: 2023-04-24 declare variable (int, float, double, long)
        int ninth = 9;
        int seven = 7;
        float statureFloat = 1.55f;
        double statureDouble = 1.55;
        long longs = 400000000;

        // TODO: 2023-04-24 declare type char Unicode (&)
        char symbolUnicode = '\u0026';
        System.out.println("symbol Unicode: " + symbolUnicode);

        // TODO: 2023-04-24 declare type char ASCII (&)
        char symbolAscii = 38;
        System.out.println("symbol ASCII: "+ symbolAscii);

        // TODO: 2023-04-24 declare type char Car
        char symbolCar = '&';
        System.out.println("symbol Car: "+ symbolCar);

        // TODO: 2023-04-24 special characters or escape sequences
        char lineBreak = '\n';
        char recoilLine ='\b';
        char tabulator = '\t';
        char startOfLine = '\r';
        char newPage = '\f';
        char quotes = '\"';
        char singleQuotes = '\'';
        char backslash = '\\';

        // TODO: 2023-04-24 declare variables type boolean
        boolean _true = true;
        boolean _false = false;

        // TODO: 2023-04-24 declare variables constants
        double VALOR_PI = 3.141592653589793;
        System.out.println("valor pi: " + VALOR_PI);

        // TODO: 2023-04-24 declare an array
        int[] array = new int[0];

        // TODO: 2023-04-24 number system: (decimal, binary, hexadecimal, octal)
        int number = 450;
        String binaryNumber = Integer.toBinaryString(number);
        String hexadecimalNumber = Integer.toHexString(number);
        String octalNumber = Integer.toOctalString(number);

        System.out.println("our number is: "+ number);

        System.out.println("number in binary is: "+binaryNumber);
        System.out.println("convert binary to our number: "+ 0b111000010); // TODO: 2023-04-24 0b111000010 -> 0b (prefix for binary)

        System.out.println("number in hexadecimal is: " + hexadecimalNumber);
        System.out.println("convert hexadecimal to our number: "+ 0x1c2); // TODO: 2023-04-24 0x (prefix for hexadecimal)

        System.out.println("number in octal: "+ octalNumber);
        System.out.println("convert octal to our number"+ 0702); // TODO: 2023-04-24 0 -> (prefix for octal)

        // TODO: 2023-04-24 practice (number system - dynamic)
        System.out.println("==================================");
        System.out.println("Number system");
        System.out.println("==================================");

        showDialog();
        terminal();
        System.out.println("=============== fin ===============");
    }

    public static void showDialog() {
        String numberStr = JOptionPane.showInputDialog(null, "Enter a whole number: ");
        int numberInt = Integer.parseInt(numberStr);
        numberSystem(numberInt);
        JOptionPane.showMessageDialog(null, "successful operation :D");
    }

    public static void terminal() {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter whole number: ");
        int number = terminal.nextInt();
        numberSystem(number);
    }

    public static void numberSystem(int number) {
        String binaryNumber = Integer.toBinaryString(number);
        String hexadecimalNumber = Integer.toHexString(number);
        String octalNumber = Integer.toOctalString(number);

        System.out.println("our number is: " + number);
        System.out.println("number in binary: "+ binaryNumber);
        System.out.println("number in hexadecimal: " +  hexadecimalNumber);
        System.out.println("number in octal: "+ octalNumber);
    }
}
