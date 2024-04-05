public class MathOperations {
    // Method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method for adding three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method for concatenating two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // Adding two integers
        int resultInt = math.add(5, 3);
        System.out.println("Result of adding two integers: " + resultInt);

        // Adding three doubles
        double resultDouble = math.add(2.5, 3.7, 1.2);
        System.out.println("Result of adding three doubles: " + resultDouble);

        // Concatenating two strings
        String resultString = math.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + resultString);
    }
}
