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

    // TODO: 2023-05-01 Exercises
    
    public static void programNumberOne() {
        // TODO: 2023-05-01 Validate that only people of legal age can enter the university.
        System.out.println("----------------------------");
        System.out.println("Exercises Number One");

        Scanner enterAge = terminal("Enter age");
        int age = enterAge.nextInt();
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
        Scanner enterNumberOne = terminal("Enter number one");
        int numberOne = enterNumberOne.nextInt();
        Scanner enterNumberTwo = terminal("Enter number two");
        int numberTwo = enterNumberTwo.nextInt();
        Scanner enterNumberThree = terminal("Enter number three");
        int numberThree = enterNumberThree.nextInt();

        int biggerNumber = numberOne;
        int minorNumber = numberOne;

        if (numberTwo > biggerNumber) {
            biggerNumber = numberTwo;
        }
        if (numberThree > biggerNumber) {
            biggerNumber = numberThree;
        }

        if (numberTwo < minorNumber) {
            minorNumber = numberTwo;
        }
        if (numberThree < minorNumber) {
            minorNumber = numberThree;
        }

        System.out.println("the number "+biggerNumber+ " is greater.");
        System.out.println("the number "+minorNumber+ " is less.");
    }
}
