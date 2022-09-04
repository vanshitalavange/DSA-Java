/*

    1    
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/
package patterns;

class Pattern_16 {
    public static void main(String[] args) {
        pattern16(6);
    }

    static void pattern16(int n) {
        StringBuilder digits = new StringBuilder();
        String[] arr = new String[n];
        int startIndex = n;
        int endIndex = n;
        for (int i = 1; i <= n; i++) {
            digits.setLength(0);
            int arrIndex = 0;
            for (int j = 1; j <= 2 * n - 1;) {

                if (j > startIndex && j < endIndex) {

                    int value1 = Integer.parseInt(arr[arrIndex]);
                    int value2 = Integer.parseInt(arr[arrIndex + 1]);
                    int sum = value1 + value2;
                    System.out.print(sum + " ");
                    digits.append(Integer.toString(sum));
                    arrIndex++;
                    j += 2;

                } else if (j == startIndex || j == endIndex) {
                    System.out.print("1 ");
                    digits.append(1);
                    j += 2;
                } else {
                    System.out.print(" ");
                    j++;
                }
            }
            System.out.println();
            arr = digits.toString().split("");
            startIndex--;
            endIndex++;
        }
    }
}
