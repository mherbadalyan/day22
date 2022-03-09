package task1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int num;
        System.out.println("Please enter symbol and program will convert it to number");
        while (true) {
            inputString = scanner.nextLine();
            num = convertStringToNum(inputString);
            if (num != -1) {
                System.out.println(num);
                break;
            } else {
                System.out.println("You entered invalid symbol, please try again");
            }
        }
    }

    /**
     * parsing given String to int and returning it. If parsing is impossible returning -1.
     *
     * @param inputString
     * @return
     */
    private static int convertStringToNum(String inputString) {
        int num;
        try {
            num = Integer.parseInt(inputString);
            return num;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
