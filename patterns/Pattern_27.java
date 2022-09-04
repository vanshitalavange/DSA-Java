/*

1 2 3 4 17 18 19 20 
  5 6 7 14 15 16
    8 9 12 13
      10 11

 */
package patterns;

public class Pattern_27 {
    public static void main(String[] args) {
        pattern27(4);
    }

    static void pattern27(int n) {

        int start = 1;
        int end = 2 * n + (2 * n - 1);
        int lastDigit = n * (n + 1);
        int leftNum = 1;
        int rightNum = lastDigit - (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n + (2 * n - 1);) {

                if (j >= start && j < 2 * n) {
                    System.out.print(leftNum + " ");
                    leftNum++;
                    j += 2;
                } else if (j > 2 * n && j <= end) {
                    System.out.print(rightNum + " ");
                    rightNum++;
                    j += 2;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            start += 2;
            end -= 2;
            rightNum = (rightNum - (n - i) - 1) - (n - i);
            System.out.println();
        }
    }
}
