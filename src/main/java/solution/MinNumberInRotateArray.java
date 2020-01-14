package solution;

public class MinNumberInRotateArray {
    public int findMin(int[] array) {
        int length = array.length;
        if(length == 0){
            return 0;
        }

        int left = 0;
        int right = length - 1;
        while(left<right){
            if(array[left] < array[right]){
                return array[left];
            }
            int mid = (left + right)/2;

            //防止出现1,0,1,1,1这种情况
            if(array[left]==array[right] && array[left] == array[mid]){
                return findMin(array,left,right);
            }

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
    public int findMin(int[] array, int left, int right){
        int res = array[left];
        for(int i = left+1;i<=right;i++){
            res = Math.min(array[i], res);
        }
        return res;
    }
}
