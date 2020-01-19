package solution;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int flag = 1;
        int now = array[0];
        for(int i = 1;i<array.length;i++){
            if(array[i] == now){
                flag ++ ;
            }else{
                flag -- ;
            }
            if(flag == 0){
                flag = 1;
                now = array[i];
            }
        }
        // 判断这个数字是否出现次数大于一半
        int t = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] == now){
                t++;
            }
        }
        if(t>array.length/2){
            return now;
        }
        return 0;
    }
}
