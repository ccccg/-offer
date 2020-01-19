package solution;

public class SingleNumber {
    public int[] solution(int[] array) {
        int res0 = 0;
        for(int i = 0;i<array.length;i++){
            res0 ^= array[i];
        }
        int k = 0;
        while((res0>>k &1)==0){
            k++;
        }
        int res1 = 0;
        for(int i = 0;i<array.length;i++){
            if((array[i]>>k&1) == 1){
                res1 ^= array[i];
            }
        }
        return new int[]{res1, res0^res1};
    }
}
