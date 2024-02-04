import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // After using th scanner class will allow user input.
        // This section is where the user inputs the three integers.


        System.out.print("Enter first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int thirdInteger = scanner.nextInt();

        // This section is where conditional statements are implemented
        // and the largest integer is determined.

        int largestInteger;

      if (firstInteger >= secondInteger && firstInteger >= thirdInteger) {
          largestInteger = firstInteger;
      } else if (secondInteger >= firstInteger && secondInteger >= thirdInteger) {
          largestInteger = secondInteger;
      } else {
          largestInteger = thirdInteger;
      }

            // output of the largest integer is "called"

    System.out.println("The largest integer is: " + largestInteger);

scanner.close();
    }
}
