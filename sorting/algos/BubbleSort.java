
// bubble sort checks for the order between adjacent elements and replaces them accordingly
package sorting.algos;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,3,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr){
        boolean isSwapped;
        for(int i=0;i<arr.length-1;i++){
            isSwapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return arr;
            }
        }
        return arr;
    }
}
