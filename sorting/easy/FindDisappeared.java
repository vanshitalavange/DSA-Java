package sorting.easy;
import java.util.*;
public class FindDisappeared {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        
        ArrayList<Integer> missing = new ArrayList<Integer>();
        int i=0;
        while(i<arr.length){
            
            if(arr[i]-1 != i){
                if(arr[arr[i]-1] == arr[i]){
                    i++;
                }else{
                    int temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                }
            }else{
                i++;
            }
        }
        
        for(int j=0;j<arr.length;j++){
            if(j != arr[j]-1){
                missing.add(j+1);
            }
        }
        
        return missing;
        
    }
}
