// Question link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
package arrays.easy;

public class CostToMoveChips {
    public static void main(String[] args) {
        int[] position = {1,2,2,3};
        System.out.println(minCostToMoveChips(position));
    }
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        
        if(even >= odd){
            return odd;
        }else{
            return even;
        }
    }
}
