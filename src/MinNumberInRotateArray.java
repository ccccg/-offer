import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        //思路一：遍历 O(n)
        //思路二：二分查找 O(logn),难点在于边界条件
        int length = array.length;
        if(length == 0){
            return 0;
        }
        
        int left = 0;
        int right = length - 1;
        while(left<right){
            int mid = (left + right)/2;
            
            if(array[left]<=array[mid]){
                left = mid;
            }else if(array[left]>array[mid]){
                right = mid;
            }
            //找好边界条件
            if(right-left==1){
                break;
            }
        }
        
        return array[right];
    }
}
