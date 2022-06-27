// Question link: https://practice.geeksforgeeks.org/problems/rotation4723/1/
package searching.binary_search;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println("Output: "+findKRotation(arr));
    }
    static int findKRotation(int arr[]) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }
    static int findPivot(int[] arr){
        int start = 0;
       int end = arr.length - 1;
         while(start <= end ){
             int mid = start+(end-start)/2;
             if(mid < end && arr[mid] > arr[mid+1]){
                 //pivot found
                 return mid;
             }else if(mid > start && arr[mid] < arr[mid-1]){
                 //pivot found
                 return mid-1;
             }
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(mid < end && arr[start] > arr[start+1]){
                    // pivot found
                    return start;
                }
                start++;
                if(mid > start && arr[end] < arr[end-1]){
                    // pivot found
                    return end-1;
                }
                end--;
            }
             else if(arr[start] <= arr[mid]){
                 start = mid + 1;
             }else if(arr[start] > arr[mid]){
                 end = mid -1;
             }
         }   
        return -1;
    }
}
