package academy.kata.test.calculator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLine()));
    }

    public static String calc(String input) {

        String[] inputElements = input.split(" ");
        Checker checker = new Checker(inputElements);

        if (!checker.isCorrectInput()) {
            return input;
        }

        String output;
        MathOperation mathOperation;
        RomanNumeral romanNumeral = new RomanNumeral();
        ArabicNumeral arabicNumeral = new ArabicNumeral();

        if (RomanNumeral.isRomanExpression(inputElements)) {
            mathOperation = romanNumeral.romanExpressionToArabicExpression(inputElements);
            int currentOutput = romanNumeral.calculate(mathOperation);
            output = arabicNumeral.arabicToRoman(currentOutput);
        } else if (ArabicNumeral.isArabicExpression(inputElements)) {
            int leftOperand = Integer.parseInt(inputElements[0]);
            String operator = inputElements[1];
            int rightOperand = Integer.parseInt(inputElements[2]);

            mathOperation = new MathOperation(leftOperand, operator, rightOperand);
            output = String.valueOf(arabicNumeral.calculate(mathOperation));
        } else {
            throw new MathOperationFormatException("т.к. величины операндов " +
                    "не удовлетворяют требованиям");
        }

        return output;
    }
}