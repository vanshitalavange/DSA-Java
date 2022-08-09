// Question link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
package sorting.easy;
import java.util.*;
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        // finding unique elements
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        findUniqueElements(list1, nums1);
        findUniqueElements(list2, nums2);

        // getting the count for each element
        int[] countOfList1 = new int[list1.size()];
        int[] countOfList2 = new int[list2.size()];
        findCountForElements(list1, nums1, countOfList1);
        findCountForElements(list2, nums2, countOfList2);

        // find intersection between two arrays
        ArrayList<Integer> common = new ArrayList<Integer>();
        if (countOfList1.length <= countOfList2.length) {
            findIntersection(list1, list2, countOfList1, countOfList2, common);
        } else {
            findIntersection(list2, list1, countOfList2, countOfList1, common);
        }
        int[] finalAns = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            finalAns[i] = common.get(i);
        }
        return finalAns;
    }

    public static void findIntersection(ArrayList list1, ArrayList list2, int[] count1, int[] count2,
            ArrayList intersection) {

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                int index1 = list1.indexOf(list1.get(i));
                int index2 = list2.indexOf(list1.get(i));
                int iterator = 0;
                if (count1[index1] <= count2[index2]) {
                    iterator = count1[index1];

                } else {
                    iterator = count2[index2];
                }
                while (iterator > 0) {
                    intersection.add(list1.get(i));
                    iterator--;
                }
            }
        }

    }

    public static void findUniqueElements(ArrayList list, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
    }

    public static void findCountForElements(ArrayList list, int[] nums, int[] countOfList) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (list.get(i).equals(nums[j])) {
                    count++;
                }
            }
            countOfList[i] = count;
        }
    }
}
