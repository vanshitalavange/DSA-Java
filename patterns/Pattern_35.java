/*

1      1
12    21
123  321
12344321

 */
package patterns;

public class Pattern_35 {
    public static void main(String[] args) {
        pattern35(4);
    }

    static void pattern35(int n) {
        StringBuilder firstHalf = new StringBuilder("");
        for (int i = 1; i <= n; i++) {

            int total = 2 * i;
            int spaces = 2 * n - total;
            int num = 1;
            for (int j = 1; j <= 2 * n; j++) {

                if (j <= i) {
                    System.out.print(num);
                    firstHalf.append(Integer.toString(num));
                    num++;
                } else if (j > i && j <= (i + spaces)) {
                    System.out.print(" ");
                } else {
                    System.out.print(firstHalf.reverse());
                    break;
                }
            }
            firstHalf.setLength(0);
            System.out.println();
        }
    }
}
