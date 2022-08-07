// Question link: https://leetcode.com/problems/missing-number/
package sorting.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] arr) {
        
        int i=0;
        while(i < arr.length){
            if(arr[i] != i){
                if(arr[i] < arr.length){
                    int temp = arr[arr[i]];
                    arr[arr[i]] = arr[i];
                    arr[i] = temp;
                }else{
             // skip the index if element is >= length of array
                    i++;
                }
            }else{
                i++;
            }
        }
        int j=0;
        while(j<arr.length){
            if(j != arr[j]){
                return j;
            }
            j++;
        }
        return j;
    }
}
