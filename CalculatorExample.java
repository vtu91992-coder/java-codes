import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                output = num1 / num2;
                break;
            default:
                System.out.println("You have entered a wrong operator.");
                scanner.close();
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
        scanner.close();
    }
}
