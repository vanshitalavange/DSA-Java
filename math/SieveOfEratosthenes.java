
package math;

import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbersTillN(40));
    }

    public static ArrayList findPrimeNumbersTillN(int n) {
        boolean[] arr = new boolean[n + 1];
        // false -> number is prime
        // true -> number is not prime

        for (int i = 2; i * i <= n; i++) {

            if (!arr[i]) {
                // eliminate all the multiples of i
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }

        ArrayList<Integer> primeNos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                primeNos.add(i);
            }
        }
        return primeNos;

    }

}
