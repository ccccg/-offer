package solution;

import java.util.ArrayList;

public class PrintMatrix {
    ArrayList<Integer> res = new ArrayList();
    public ArrayList<Integer> printMatrix(int [][] matrix) {

        int row = matrix.length;
        if(row == 0){
            return null;
        }
        int col = matrix[0].length;
        int start = 0;
        while(row > start * 2 && col > start * 2){
            printSub(matrix, row, col, start);
            start++;
        }
        return res;
    }
    public void printSub(int[][] matrix, int row, int col, int start){
        int endX = col - 1 - start;
        int endY = row - 1 - start;
        for(int i = start; i <= endX; i++){
            res.add(matrix[start][i]);
        }
        if(start+1<=endY){
            for(int i = start+1;i<=endY;i++){
                res.add(matrix[i][endX]);
            }
        }
        if(start+1<=endX && start+1<=endY){
            for(int i = endX-1;i>=start;i--){
                res.add(matrix[endY][i]);
            }
        }
        if(start+1<=endX && start+1<endY){
            for(int i = endY - 1;i>start;i--){
                res.add(matrix[i][start]);
            }
        }
    }
}
