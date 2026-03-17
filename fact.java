public class FactorialIterative {
    public static void main(String[] args) {
        int number = 10; // Change this value for a different factorial
        long factorial = 1; // Use long to prevent overflow for larger numbers

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
