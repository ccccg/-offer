public class Solution {
    public boolean Find(int target, int [][] array) {
        //思路一：直接遍历查找
        //思路二：从左下角往右上角找
        int col = array[0].length;
        int row = array.length;
        int c = 0;
        int r = row-1;
        while(r >= 0 && c < col){
            if(array[r][c] == target){
                return true;
            }else if(array[r][c] > target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }
}
