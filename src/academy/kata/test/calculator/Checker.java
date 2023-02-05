package academy.kata.test.calculator;

import java.util.Objects;

class Checker {
    private String[] input;

    public Checker(String[] input) {
        this.input = input;
    }

    public boolean isCorrectInput() {

        if (input.length < 3) {
            throw new MathOperationFormatException("т.к. строка не является математической операцией");
        }

        if (input.length > 3) {
            throw new IllegalArgumentException("т.к. формат математической операции " +
                    "не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (ArabicNumeral.isArabicNumeral(input[0]) && RomanNumeral.isRomanNumeral(input[2]) ||
                ArabicNumeral.isArabicNumeral(input[2]) && RomanNumeral.isRomanNumeral(input[0])) {
            throw new NumberFormatException("т.к. используются одновременно разные системы счисления");
        }

        return true;
    }
}
