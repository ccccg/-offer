package solution;

public class GetNumberOfK {
    public int solution(int [] array , int k) {
        //二分查找z 若 mid = (l + r) / 2; 且退出循环条件为 l < r, 则执行l = mid会无法退出，
        //要注意 l == mid 时会无限循环，需要手动判断退出
        if(array.length <= 0){
            return 0;
        }
        int down = getDown(array, k, 0, array.length-1);
        int up = getUp(array, k, 0, array.length-1);
        if(down == -1){
            return 0;
        }
        return up-down+1;

    }
    //找上界，容易出现死循环，注意判断
    public int getUp(int[] array, int k, int l, int r){
        int mid;
        while(l<r){
            mid = (l + r) / 2;
            if(array[mid] <= k){
                l = mid;
            }else{
                r = mid - 1;
            }
            // 这里判断避免死循环
            if(l==r-1){
                break;
            }
        }
        if(array[l] == k){
            if(array[l]==array[r]){
                return r;
            }
            return l;
        }
        return -1;

    }
    public int getDown(int [] array, int k, int l, int r){
        int mid;
        while(l<r){
            mid = (l + r) / 2;
            if(array[mid] >= k){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        if(array[r] == k){
            return r;
        }
        return -1;
    }
}
