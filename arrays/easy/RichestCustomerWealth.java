/*
Q. You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
 */
package arrays.easy;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 2, 3, 4 } };
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int arraySum = getSumOfArray(accounts[i]);
            if (arraySum > max) {
                max = arraySum;
            }

        }
        System.out.print("Input: ");
        for (int i = 0; i < accounts.length; i++)
            System.out.print(Arrays.toString(accounts[i]));
        System.out.println();
        System.out.println("Output: " + max);
    }

    static int getSumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr)
            sum = sum + i;
        return sum;
    }
}
