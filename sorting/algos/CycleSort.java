// Use cycle sort only if given numbers are from 1 to N
package sorting.algos;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }

    static int[] cycleSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int indexOfElement = arr[i] - 1;
            if(i != indexOfElement){
                int temp = arr[indexOfElement];
                arr[indexOfElement] = arr[i];
                arr[i] = temp; 
            }else{
                i++;
            }
        }
        return arr;
    }
}
