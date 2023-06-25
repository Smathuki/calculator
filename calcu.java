import java.util.Scanner; // Importing the Scanner class from java.util package

public class calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for user input
        double num1, num2; // Declaring variables to store the numbers entered by the user

        // Prompting the user to enter the first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble(); // Reading and storing the first number entered by the user

        // Prompting the user to enter the second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble(); // Reading and storing the second number entered by the user

        // Displaying the menu of operations to the user
        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt(); // Reading the choice of operation entered by the user

        // Using a switch statement to perform the selected operation
        switch (choice) {
            case 1:
                // Calling the add() method and displaying the result
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                // Calling the subtract() method and displaying the result
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                // Calling the multiply() method and displaying the result
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    // Checking if the second number is zero to avoid division by zero
                    System.out.println("Cannot divide by zero.");
                } else {
                    // Calling the divide() method and displaying the result
                    System.out.println("Result: " + divide(num1, num2));
                }
                break;
            default:
                // Handling an invalid choice entered by the user
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close(); // Closing the Scanner object to release resources
    }

    // Method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
