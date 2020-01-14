package solution;

public class Pow {
    public double myPow(double base, int exponent) {
        // 特殊情况
        // 底数是1
        if(equal(base,0.0)){
            return 0.0;
        }
        // 指数是1
        if(exponent == 0){
            return 1;
        }
        double res = 1.0;
        // int的最小值的 绝对值还是int的最小值，还是负数
        if(exponent == Integer.MIN_VALUE){
            res = pow(base, Integer.MAX_VALUE)*base;
        }else{
            int temp = Math.abs(exponent);

            //改递归，使复杂度降到logN
            res = pow(base, temp);
        }

        //指数为负，取倒数
        if(exponent < 0){
            res = 1.0/res;
        }
        return res;
    }

    public double pow(double base, int temp){
        if(temp==0){
            return 1.0;
        }
        double res = pow(base, temp>>1);
        if((temp&1)==1){
            return res * res *base;
        }else{
            return  res * res;
        }
    }

    /**
     * double类型的判断 不能使用 == ，需要人为规定一个精度
     * @param num1
     * @param num2
     * @return
     */

    public boolean equal(double num1, double num2){
        if((num1-num2 > -0.0000001)&&
                (num1-num2 < 0.0000001)){
            System.out.println("asd");
            return true;
        }
        return false;
    }

}
