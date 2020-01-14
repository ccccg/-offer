package solution;

/**
 * 斐波那契数列，相关问题跳台阶、矩形填充
 * 本质上是动态规划，但是可以注意空间的优化
 */

public class Fibonacci {

    public int solution(int n){
        int[] fib = new int[2];
        fib[0] = 0;
        fib[1] = 1;
        if(n<2){
            return fib[n];
        }

        for(int i = 2;i<n;i++){
            int temp = fib[0]+fib[1];
            fib[0] = fib[1];
            fib[1] = temp;
        }
        return fib[0] + fib[1];
    }
}
