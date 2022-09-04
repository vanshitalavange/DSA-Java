/*

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

 */
package patterns;

public class Pattern_31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {

        StringBuilder prev = new StringBuilder();
        StringBuilder curr = new StringBuilder();
        StringBuilder subStr = new StringBuilder();
        int start = 1;
        int end = (2 * n - 1) + (2 * n - 2);
        int blanks = (2 * n - 1) + (2 * n - 2);
        for (int i = 1; i <= 2 * n - 1; i++) {
            curr.setLength(0);
            subStr.setLength(0);
            for (int j = 1; j <= blanks;) {

                if (j >= start && j <= end) {
                    if (i <= n) {
                        System.out.print(n - (i - 1) + " ");
                        curr.append(n - (i - 1) + " ");
                    } else {
                        System.out.print((i - n) + 1 + " ");
                        curr.append((i - n) + 1 + " ");
                    }
                    j += 2;
                } else if (j < start) {
                    System.out.print(prev);
                    curr.append(prev);
                    j += prev.length();
                } else {

                    subStr.append(prev.substring(0, prev.length() - 1));

                    System.out.print(subStr.reverse());
                    curr.append(subStr.reverse());
                    break;
                }
            }
            System.out.println();
            prev.setLength(0);
            if (i >= n && i < 2 * n - 1) {
                start -= 2;
                end += 2;
                prev.append(curr.substring(0, ((2 * n - 1 - i) - 1) * 2));
            } else {
                start += 2;
                end -= 2;
                prev.append(curr.substring(0, i * 2));
            }
        }

    }
}
