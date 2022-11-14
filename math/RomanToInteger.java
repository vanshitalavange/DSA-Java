package math;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int result = 0;
        int currValue = 0;
        int lastCurrValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
                default:
                    currValue = 0;
            }

            if (currValue >= lastCurrValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            lastCurrValue = currValue;
        }
        return result;
    }
}
