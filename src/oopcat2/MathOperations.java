package oopcat2;

// Method Overloading: Same method name but different parameters
class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Main method to test overloading
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Testing overloaded methods
        System.out.println("Sum of 2 and 3: " + math.add(2, 3));
        System.out.println("Sum of 2, 3, and 5: " + math.add(2, 3, 5));
        System.out.println("Sum of 2.5 and 3.7: " + math.add(2.5, 3.7));
    }
}
