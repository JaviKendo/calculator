package academy.kata.test.calculator;

class ArabicNumeral extends Numeral {
    public String arabicToRoman(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("т.к. в римской системе нет отрицательных чисел и 0");
        }

        StringBuilder output = new StringBuilder();

        if (value == 100) {
            output.append("C");
            return output.toString();
        }
        if (value >= 90) {
            output.append("XC");
            value -= 90;
        }
        if (value >= 80) {
            output.append("LXXX");
            value -= 80;
        }
        if (value >= 70) {
            output.append("LXX");
            value -= 70;
        }
        if (value >= 60) {
            output.append("LX");
            value -= 60;
        }
        if (value >= 50) {
            output.append("L");
            value -= 50;
        }
        if (value >= 40) {
            output.append("XL");
            value -= 40;
        }

        for (; value >= 10; value -= 10) {
            output.append("X");
        }

        if (value >= 1) {
            output.append(Rome.values()[value - 1].name());
        }

        return output.toString();
    }

    public static boolean isArabicExpression(String[] expression) {
        return isArabicNumeral(expression[0]) && isArabicNumeral(expression[2]);
    }

    public static boolean isArabicNumeral(String element) {
        Rome[] romes = Rome.values();

        for (Rome value : romes) {
            if (value.getTranslation().equals(element)) {
                return true;
            }
        }
        return false;
    }
}
