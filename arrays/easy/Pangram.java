/*
 * Q. A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
 */
package arrays.easy;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String ans = checkIfPangram(sentence) ? "Pangram" : "Not a Pangram";
        System.out.println("Input: " + sentence);
        System.out.println("Output: " + ans);
    }

    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        } else {
            String alphabets = "";
            for (int i = 0; i < sentence.length(); i++) {
                String letter = Character.toString(sentence.charAt(i));
                if (!alphabets.contains(letter)) {
                    alphabets = alphabets + letter;
                }
            }
            if (alphabets.length() == 26) {
                return true;
            }
        }
        return false;
    }
}
