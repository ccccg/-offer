package solution.thread;

public class TestSynchronized {

    public static void main(String[] args) {
        TestSynchronized testSynchronized = new TestSynchronized();
        /*Thread t1 = new Thread(()->{
            testSynchronized.method1();
        });*/
        Thread t2 = new Thread(()->{
            testSynchronized.method2();
        });
        Thread t3 = new Thread(()->{
            TestSynchronized.method0();
        });
        Thread t4 = new Thread(()->{
            TestSynchronized.method4();
        });
        Thread t5 = new Thread(()->{
            testSynchronized.method5();
        });
        //t4.start();
        //t3.start();
        t5.start();
        t2.start();
    }

    /**
     * 类锁和对象锁互不影响,类锁之间会相互影响
     */
    public static synchronized void method0(){
        for(int i = 0;i<10;i++){
            System.out.println("method0");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void method4(){
        for(int i = 0;i<10;i++){
            System.out.println("method4");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void method1(){
        for(int i = 0;i<10;i++){
            System.out.println("method1");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void method2(){
        for(int i = 0;i<10;i++){
            System.out.println("method2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *  上下两种写法都是对类的实例加锁，对象锁
     *  同一个对象的成员方法加锁，会互相影响
     *  因为是对对象的monitor，多个线程因为持有同一个对象而同步
     */

    /*public void method2(){
        synchronized(this){
            for(int i = 0;i<10;i++){
                System.out.println("method2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

    public void method5(){
        synchronized (TestSynchronized.class){
            for(int i = 0;i<10;i++){
                System.out.println("method5");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

class SyncRunnable implements Runnable{


    public void run(){

    }

}