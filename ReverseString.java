// Scanner class to get user input

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Remove Spaces + Reverse String

        String stringWithoutSpaces = userInput.replaceAll(" ", "");

        StringBuilder reversedString = new StringBuilder(stringWithoutSpaces).reverse();

        // Output

        System.out.println("Reversed string (ignoring spaces): " + reversedString.toString());

scanner.close();

    }
}