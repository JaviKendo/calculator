package academy.kata.test.calculator;

class MathOperationFormatException extends IllegalArgumentException {
    public MathOperationFormatException() {
        super();
    }
    public MathOperationFormatException(String s) {
        super(s);
    }
}
