public class RomanNumerals {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 50, 90, 40, 10, 9, 5, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "DC", "C", "L", "XC", "XL", "X", "IX", "V", "I"};

    public static String toRoman(int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < VALUES.length; i++) {
            while (number >= VALUES[i]) {
                result.append(SYMBOLS[i]);
                number -= VALUES[i];
            }
        }
        return result.toString();
    }
}
