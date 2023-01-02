//This file contains set of simple questions solved using recursion
package recursion.easy;

public class LevelOneQuestions {
    public static void main(String[] args) {
        fun(5);
        funRev(5);
        funBoth(5);
        System.out.println(factorial(5));
        System.out.println(sumOfN(3));
        System.out.println(sumOfDigits(1342));
        System.out.println(reverseNumber(1342));
        System.out.println(reverseNumber2(1278, 0));
        System.out.println(isNumberPalindrome(112));
        System.out.println(countZerosInNumber(102010));
        System.out.println(numberOfSteps(14));
    }

    // 1. printing numbers from n to 1
    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    // 2. printing numbers from 1 to n
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);

    }

    // 3. printing numbers from n to 1 then 1 to n
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

    // 4. factorial of a number
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // 5. sum of numbers from 1 to n
    static int sumOfN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfN(n - 1);
    }

    // 6. sum of actual digits in the number eg. sum(123) = 6
    static int sumOfDigits(int n) {
        if (n / 10 == 0) { // n/10 == 0 represents that this digit is the last one to be added
            return n % 10;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    // 7.1 reverse of a number method 1
    static int reverseNumber2(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        ans = ans * 10 + (n % 10);
        return reverseNumber2(n / 10, ans);
    }

    // 7.2 reverse of a number method 2
    static int reverseNumber(int n) {
        if (n / 10 == 0) {
            return n % 10;
        }
        int digits = (int) (Math.log10(n) + 1);
        return (n % 10) * (int) Math.pow(10, digits - 1) + reverseNumber(n / 10);
    }

    // 8. check if a number is palindromic or not
    static boolean isNumberPalindrome(int n) {
        // Method 1: return n == reverseNumber2(n);
        String s = Integer.toString(n);
        int start = 0;
        int end = s.length() - 1;
        // Method 2 - O(log n) comparing start & end
        return helperForPalindrome(start, end, s);
    }

    static boolean helperForPalindrome(int start, int end, String s) {
        if (start > end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return helperForPalindrome(++start, --end, s);
    }

    // 9. Count number of zeros in a given number
    static int countZerosInNumber(int n) {
        return helperForCountingZeros(n, 0);
    }

    static int helperForCountingZeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        int temp = n % 10;
        if (temp == 0) {
            count++;
        }
        return helperForCountingZeros(n / 10, count);
    }

    // 10. Number of steps to reduce the number to zero
    // leetcode question link:
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public static int numberOfSteps(int num) {
        return helperforCountingSteps(num, 0);
    }

    public static int helperforCountingSteps(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        if (n % 2 == 0)
            return helperforCountingSteps(n / 2, steps + 1);
        else
            return helperforCountingSteps(n - 1, steps + 1);
    }

}
