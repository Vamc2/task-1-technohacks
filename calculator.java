import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Please select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                performAddition();
                break;
            case 2:
                performSubtraction();
                break;
            case 3:
                performMultiplication();
                break;
            case 4:
                performDivision();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();
    }

    public static void performAddition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static void performDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }

        scanner.close();
