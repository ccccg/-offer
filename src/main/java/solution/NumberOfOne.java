package solution;

public class NumberOfOne {

    public int NumberOf1(int n) {
        int res = 0;
        while(n!=0){
            // if(n&1==1) 编译不通过，== 比 & 优先级高
            if((n&1)==1){res++;}
            // >>表示有符号右移，会在负数的左边位补1
            // >>>表示无符号右移，在负数的左边补0
            // 计算机中，负数用补码表示
            n = n>>>1;
        }
        return res;
    }

}
