import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Arrays {
    public static void main (String[] args) {
        Arrays.ArrayOrList();
    }

    public static String terminal(String dataEntry) {
        Scanner terminal = new Scanner(System.in);
        System.out.print(dataEntry + ": ");
        return terminal.next();
    }

    // TODO: 2023-06-02 Array - Enter three numbers and display in an array
    public static void ArrayOrList() {
        String firstNumber = terminal("Enter first number");
        String secondNumber = terminal("Enter second number");
        String thirdNumber = terminal("Enter third number");

        String [] arrayNumbers = new String[3];
        arrayNumbers[0] = firstNumber;
        arrayNumbers[1] = secondNumber;
        arrayNumbers[2] = thirdNumber;

        List<String> listNumbers = new ArrayList<>();
        listNumbers.add(firstNumber);
        listNumbers.add(secondNumber);
        listNumbers.add(thirdNumber);

        String resultJoinArrayByCommas = String.join(",", java.util.Arrays.stream(arrayNumbers).map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("type of : " + ((Object) arrayNumbers).getClass().getSimpleName());
        System.out.println("result join array by commas: " + resultJoinArrayByCommas);
        System.out.println("---------------------------------------------------");
        String resultJoinListByCommas = String.join(",", listNumbers);
        System.out.println("type of: "+ ((Object) listNumbers).getClass().getSimpleName());
        System.out.println("result join list by commas: "+ resultJoinListByCommas);
    }
}
