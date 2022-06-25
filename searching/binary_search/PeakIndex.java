package searching.binary_search;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println("Output: "+findPeakOfMountain(arr));
    }
    public static int findPeakOfMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }
}
