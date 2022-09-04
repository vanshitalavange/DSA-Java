/*

        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

 */
package patterns;

public class Pattern_30 {
    public static void main(String[] args) {
        pattern30(5);
    }

    static void pattern30(int n) {

        StringBuilder prev = new StringBuilder();
        StringBuilder curr = new StringBuilder();

        int start = 2 * n - 1;
        int end = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            curr.setLength(0);
            for (int j = 1; j <= end;) {

                if (j == start || j == end) {
                    System.out.print(i + " ");
                    j += 2;
                    curr.append(i + " ");
                } else if (j > start && j < end) {
                    System.out.print(prev);
                    curr.append(prev);
                    j += prev.length();
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
            prev.setLength(0);
            prev.append(curr);
            start -= 2;
            end += 2;
        }

    }
}
