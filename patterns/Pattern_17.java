/*

    1    
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1 

 */
package patterns;

public class Pattern_17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    static void pattern17(int n) {
        StringBuilder prev = new StringBuilder("");
        StringBuilder curr = new StringBuilder("");
        StringBuilder subStr = new StringBuilder();

        for (int i = 1; i <= 2 * n - 1; i++) {
            curr.setLength(0);
            int start = 0;
            int end = 0;
            if (i <= n) {
                start = n - (i - 1);
                end = (2 * n - 1) - (n - i);
            } else {
                start = (i - n) + 1;
                end = (2 * n - 1) - (i - n);
            }

            for (int j = 1; j <= 2 * n - 1;) {

                if ((i <= n) && (j == start || j == end)) {
                    curr.append(Integer.toString(i));
                    System.out.print(i);
                    j++;
                } else if ((i > n) && (j >= start && j <= end)) {
                    subStr.setLength(0);
                    subStr.append(prev.substring(1, prev.length() - 1));
                    System.out.print(subStr);
                    curr.append(subStr);
                    j = 2 * n - 1;

                } else if ((i <= n) && (j > start && j < end)) {
                    // print previous string here
                    System.out.print(prev);
                    curr.append(prev);
                    j += prev.length();
                } else {
                    System.out.print(" ");
                    j++;
                }

            }
            prev.setLength(0);
            prev.append(curr);
            System.out.println();
        }
    }
}
