/*

    1
   1 1
  1 2 1
 1 3 3 1
1 4 4 4 1

*/
package patterns;

class Pattern_16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    static void pattern16(int n) {

        for (int i = 1; i <= n; i++) {
            int startIndex = n - (i - 1);
            int endIndex = (2 * n - 1) - (n - i);
            for (int j = 1; j <= 2 * n - 1;) {

                if (j > startIndex && j < endIndex) {
                    System.out.print(i - 1 + " ");
                    j += 2;

                } else if (j == startIndex || j == endIndex) {
                    System.out.print("1 ");
                    j += 2;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
        }
    }
}
