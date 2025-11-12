class Adder {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    static double add(double a, double b) {
        return a + b;
    }
}

public class TestOverloading2 {
    public static void main(String[] args) {
        // Calling the add method with two integers
        System.out.println("Sum of 11 and 11 is: " + Adder.add(11, 11));

        // Calling the add method with two doubles
        System.out.println("Sum of 12.3 and 12.6 is: " + Adder.add(12.3, 12.6));
    }
}
