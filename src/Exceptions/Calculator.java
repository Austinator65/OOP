package Exceptions;

class Calculator {
    public int divide(int dividend, int divisor) throws CustomException {
        if (divisor == 0) {
            throw new CustomException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }
}
