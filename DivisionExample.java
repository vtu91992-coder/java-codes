// Custom exception class
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionExample {

    // Method to perform division
    public static double divide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        int num = 10;
        int den = 0;

        try {
            // Attempt to divide
            System.out.println("Attempting division...");
            double result = divide(num, den);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            // Handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in finally block will always execute
            System.out.println("Division attempt finished.");
        }
    }
}
