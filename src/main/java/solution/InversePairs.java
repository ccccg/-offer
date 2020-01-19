package solution;

public class InversePairs {
    public int solution(int [] array){
        if(array.length == 0){
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i = 0;i<array.length;i++){
            copy[i] = array[i];
        }
        return inversePairs(array, copy, 0, array.length-1);
    }
    public int inversePairs(int[] array, int[] copy, int start, int end){
        if(start == end){
            copy[start] = array[start];
            return 0;
        }else{
            int mid = (end+start)/2;
            //巧妙地利用 数组引用的交换，将下一层递归排好序的copy的作为这层递归的data使用
            //使这时的data变成部分有序
            int sum = (inversePairs(copy,array, start, mid)
                    + inversePairs(copy,array, mid + 1, end))%1000000007;
            int p1 = mid;
            int p2 = end;
            int indexCopy = end;
            while(p1>=start&&p2>mid){
                if(array[p1]>array[p2]){
                    copy[indexCopy--] = array[p1--];
                    sum += p2-mid;
                    sum %= 1000000007;
                }else{
                    copy[indexCopy--] = array[p2--];
                }
            }
            for(;p1>=start;p1--){
                copy[indexCopy--] = array[p1];
            }
            for(;p2>mid;p2--){
                copy[indexCopy--] = array[p2];
            }
            return sum%1000000007;
        }

    }
}
