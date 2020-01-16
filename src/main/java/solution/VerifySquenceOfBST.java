package solution;

public class VerifySquenceOfBST {
    public boolean solution(int [] sequence) {

        int length = sequence.length;
        if(length == 0){
            return false;
        }
        if(length == 1){
            return true;
        }
        return verify(sequence,0,sequence.length-1);

    }
    public boolean verify(int[] sequence, int start, int end){
        if(start >= end){
            return true;
        }
        int rootV = sequence[end];
        int i = end-1;
        for(;i>=start;i--){
            if(sequence[i] < rootV){
                for(int k = i;k>=start;k--){
                    if(sequence[k]>rootV){
                        return false;
                    }
                }
                break;
            }
        }
        return verify(sequence,start,i)&&verify(sequence,i+1,end-1);

    }
}
