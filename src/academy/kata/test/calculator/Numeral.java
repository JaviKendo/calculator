package academy.kata.test.calculator;

abstract class Numeral implements Calculator {
    @Override
    public int calculate(MathOperation mathOperation) {
        int result;
        switch (mathOperation.getOperator()) {
            case "+":
                result = mathOperation.getLeftOperand() + mathOperation.getRightOperand();
                break;
            case "-":
                result = mathOperation.getLeftOperand() - mathOperation.getRightOperand();
                break;
            case "*":
                result = mathOperation.getLeftOperand() * mathOperation.getRightOperand();
                break;
            case "/":
                result = mathOperation.getLeftOperand() / mathOperation.getRightOperand();
                break;
            default:
                throw new MathOperationFormatException("т.к. формат математической операции " +
                        "не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        return result;
    }
}
