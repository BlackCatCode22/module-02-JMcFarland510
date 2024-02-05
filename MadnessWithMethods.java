import java.util.Scanner;

public class MadnessWithMethods {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        // After the scanner class is implemented and the getUserInput method is created
        // the user can now input an integer

        System.out.println("Enter an integer: ");

        int userInput = scanner.nextInt();

        // Here a return statement is implemented ,and I change the public static int method
        // to public static void string in order to print out the integer that was entered

        return userInput;

    }

    public static void main(String[] args) {
        int userNumber = getUserInput();

        System.out.println("The integer you entered is: "  + userNumber);



            }
        }
// This program is incomplete. Everytime I attempted to add a method that compared two integers
// as well as sum two integers I kept getting errors that I couldn't troubleshoot. I figured it was better
// to upload something as opposed to nothing if only to get feedback. I'm going to spend my time revisiting
// what we have previously learned in an attempt to see what I'm missing.