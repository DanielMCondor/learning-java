import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Conditionals.programNumberOne();
        Conditionals.programNumberTwo();
    }

    // TODO: 2023-05-01 create terminal
    public static Scanner terminal(String dataEntry) {
        Scanner terminal = new Scanner(System.in);
        System.out.print(dataEntry + ": ");
        return terminal;
    }

    public static int loadNumber(String dataEntry) {
        Scanner enterNumber = terminal(dataEntry);
        return enterNumber.nextInt();
    }

    // TODO: 2023-05-01 Exercises
    public static void programNumberOne() {
        // TODO: 2023-05-01 Validate that only people of legal age can enter the university.
        System.out.println("----------------------------");
        System.out.println("Exercises Number One");

        int age = loadNumber("Enter age");
        boolean isOlder = age >= 18;

        if (isOlder) {
            Scanner enterName = terminal("Enter name");
            String name = enterName.next();
            System.out.println("Hello " +name+ ", welcome to the university.");
        } else {
            System.out.println("Only adults of legal age enter the university.");
        }
        System.out.println("----------------------------");
    }

    public static void programNumberTwo() {
        // TODO: 2023-05-01 Enter three numbers and identity which is greater and lesser.
        int numberOne = loadNumber("Enter number one");
        int numberTwo = loadNumber("Enter number two");
        int numberThree = loadNumber("Enter number three");

        int biggerNumber = calculateLargerNumber(numberOne, numberTwo, numberThree);
        int minorNumber = calculateSmallerNumber(numberOne, numberTwo, numberThree);

        System.out.println("the number "+biggerNumber+ " is greater.");
        System.out.println("the number "+minorNumber+ " is less.");
    }

    // TODO: 2023-05-31 calculate larger number
    public static int calculateLargerNumber(int numberOne, int numberTwo, int numberThree) {
        int biggerNumber = numberOne;
        if (numberTwo > biggerNumber) {
            biggerNumber = numberTwo;
        }
        if (numberThree > biggerNumber) {
            biggerNumber = numberThree;
        }
        return biggerNumber;
    }

    // TODO: 2023-05-31 calculate smaller number 
    public static int calculateSmallerNumber(int numberOne, int numberTwo, int numberThree) {
        int minorNumber = numberOne;
        if (numberTwo < minorNumber) {
            minorNumber = numberTwo;
        }
        if (numberThree < minorNumber) {
            minorNumber = numberThree;
        }
        return minorNumber;
    }
}
