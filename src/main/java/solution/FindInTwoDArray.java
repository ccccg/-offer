package solution;

public class FindInTwoDArray {

    public boolean solution(int target, int[][] array){
        int row = array.length;
        // 注意边界条件判断
        // 不判断会报 ArrayIndexOutOfBoundsException
        if(row == 0){
            return false;
        }
        int col = array[0].length;
        int i = row-1;
        int j = 0;
        while(i >= 0 && j < col){
            if(array[i][j] == target){
                return true;
            }
            if(array[i][j] > target){
                i--;
            }else {
                j++;
            }
        }
        return false;
    }

}
