import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Loops.programNumberOne();
        Loops.programNumberTwo();
    }

    public static Scanner terminal(String dataEntry) {
        Scanner terminal = new Scanner(System.in);
        System.out.print(dataEntry + ": ");
        return terminal;
    }

    public static void programNumberOne() {
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

    public static void programNumberTwo() {
        // TODO: 2023-06-01 show the first 100 prime numbers
        System.out.println("-------------------------------");
        System.out.println("show the first 100 prime numbers");
        System.out.println("-------------------------------\n");
        String result = "";
        int count = 0;
        int number = 1;
        while (count < 100) {
            if (isPrime(number)) {
                result += number + ", ";
                count++;
            }
            number++;
        }

        System.out.println("the first 100 prime numbers are: " + result);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i<number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
