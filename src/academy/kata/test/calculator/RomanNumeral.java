package academy.kata.test.calculator;

class RomanNumeral extends Numeral {

    public MathOperation romanExpressionToArabicExpression(String[] expression) {
        int leftOperand = romanToArabic(expression[0]);
        String operator = expression[1];
        int rightOperand = romanToArabic(expression[2]);
        return new MathOperation(leftOperand, operator, rightOperand);
    }

    public static int romanToArabic(String number) {
        return Rome.valueOf(number).ordinal() + 1;
    }

    public static boolean isRomanExpression(String[] expression) {
        return isRomanNumeral(expression[0]) && isRomanNumeral(expression[2]);
    }

    public static boolean isRomanNumeral(String element) {
        Rome[] romes = Rome.values();

        for (Rome value : romes) {
            if (value.name().equals(element)) {
                return true;
            }
        }
        return false;
    }
}
