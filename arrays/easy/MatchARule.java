/*
 * Q. You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
 */
package arrays.easy;

import java.util.*;

public class MatchARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "phone"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        int count = countMatches(items, "color", "blue");
        System.out.println("Match Found: " + count);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int checkIndex = 0;
        int count = 0;
        switch (ruleKey) {
            case "type" -> checkIndex = 0;
            case "color" -> checkIndex = 1;
            case "name" -> checkIndex = 2;
            default -> checkIndex = 0;
        }
         for (int i = 0; i < items.size(); i++) {
            List<String> subList = new ArrayList<String>(items.get(i));
            if (subList.get(checkIndex).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
