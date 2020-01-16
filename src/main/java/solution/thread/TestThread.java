package solution.thread;

public class TestThread {

    public static void main(String[] args) {

         //第一种方法， index不共享
        /*Thread t1 = new TestTask();
        Thread t2 = new TestTask();
        t1.start();
        t2.start();*/

        //共用一个runnable实现类，里面变量共享
        /*TestRunnable testRunnable = new TestRunnable();
        Thread t3 = new Thread(testRunnable);
        Thread t4 = new Thread(testRunnable);
        t3.start();
        t4.start();
        */

        // 构造方法new Thread(new Runnable(){ 实现run方法 })
        Thread t5 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0;i<5;i++){
                    System.out.println("*****A "+ i);
                }
            }
        });
        Thread t7 = new Thread(()->{
                for(int i = 0;i<5;i++){
                    System.out.println("*****C "+ i);
                }
        });
        Thread t6 = new Thread(){
            public void run() {
                for(int i = 0;i<5;i++){
                    System.out.println("*****B "+ i);
                }
            }
        };
        t5.start();
        t6.start();
        t7.start();
    }
}


class TestTask extends Thread{
    // 静态变量在所有TestTask类共享
    static int index = 0;
    @Override
    public void run(){
        for(;index<10;index++){
            System.out.println(Thread.currentThread()+" : "+ index);

        }
    }
}

class TestRunnable implements Runnable{

    int index = 0;

    public void run(){
        for(;index<10;index++){
            System.out.println(Thread.currentThread()+" : "+ index);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}