// Question link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// amazon interview question
package searching.binary_search.easy;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        // assume below array to be infinite
        int[] arr = {3,4,6,8,9,12,15,18,19,20,22,24,55,66,67,68,90, 99, 101, 120, 123, 130, 155, 160, 167,187};
        int target = 24;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            int size = end - start + 1;
            end = end + (size*2);
            start = newStart;
        }
        System.out.println("Output: "+binarySearch(arr, target, start,end));
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/ 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
