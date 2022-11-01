
package math;
import java.util.*;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbersTillN(40));
    }
    public static ArrayList findPrimeNumbersTillN(int n) {
        int[] arr = new int[n - 1];
        int sqrt = (int) Math.sqrt(n);
        int i = 0;
        while (i <= sqrt) {
            int indexValue = i + 2;
            if (arr[i] == 0) {
                // check if the number is prime
                if (isPrime(indexValue)) {
                    arr[i] = 1;
                    //eliminate all the multiples
                    eliminateMultiples(indexValue, arr, i + 1);
                }
            }
            i++;
        }

        ArrayList<Integer> primeNos = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 1 || arr[j] == 0) {
                primeNos.add(j + 2);
            }
        }

        return primeNos;

    }

    public static void eliminateMultiples(int n, int[] arr, int startIndex) {

        for (int i = startIndex; i < arr.length; i++) {
            int indexValue = i + 2;
            if (indexValue % n == 0) {
                arr[i] = -1;
            }
        }

    }

    public static boolean isPrime(int n) {
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
