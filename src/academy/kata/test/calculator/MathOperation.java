package academy.kata.test.calculator;

class MathOperation {
    private final String operator;
    private final int leftOperand, rightOperand;

    public MathOperation(int leftOperand, String operator, int rightOperand) {
        this.leftOperand = leftOperand;
        this.operator = operator;
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }
}
