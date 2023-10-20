package Exceptions;

public class app {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int result = calculator.divide(30, 0);
            System.out.println("Result: " + result);
        } catch (CustomException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}