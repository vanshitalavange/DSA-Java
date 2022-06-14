package functions;

// Q. Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 6, 5 };
        System.out.println(checkIfPythagoreanTripletPresent(arr));
    }

    static boolean checkIfPythagoreanTripletPresent(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sumOfSquares = arr[i] * arr[i] + arr[j] * arr[j];
                for (int k : arr) {
                    if (k == Math.sqrt(sumOfSquares)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
