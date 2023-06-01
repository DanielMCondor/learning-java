import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        //Conditionals.programNumberOne();Conditionals.programNumberTwo();
        Conditionals.ProgramNumberThree();
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

        String averageNumber = calculateAverageNumber(numberOne, numberTwo, numberThree);
        System.out.println("the number "+biggerNumber+ " is greater.");
        System.out.println("the number "+minorNumber+ " is less.");
        System.out.println("the average number is: " + averageNumber);
    }
    
    public static void ProgramNumberThree() {
        // TODO: 2023-06-01 Enter a list of numbers separated by commas and identify odd and even numbers
        System.out.println("-------------------------------");
        System.out.println("Identify odd and even numbers");
        System.out.println("-------------------------------\n");

        Scanner enterNumbers = terminal("Enter numbers separated by commas (,)");
        String strNumbers = enterNumbers.next();
        System.out.println("the list entered is: "+ strNumbers);
        String[] listNumbers = strNumbers.split(",");
        for (String strNumber : listNumbers) {
            int number = Integer.parseInt(strNumber);
            boolean isEven = number % 2 == 0;
            String text = isEven ? "even" : "odd";
            System.out.println("the number "+number+" is "+text);
        }
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

    public static String calculateAverageNumber(int numberOne, int numberTwo, int numberThree) {
        double suma = numberOne + numberTwo + numberThree;
        return String.format("%.3f", suma / 3);
    }
}
