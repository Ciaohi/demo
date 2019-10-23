package Java.MultiThread;

/**
 * Created by ciaohi on 2019/10/23 8:48
 */


public class ThreadDemo {
    public static void main(String args[]) {
      /*  MyThread1 t = new MyThread1();
        t.start();
        while (true) {
            System.out.println("兔子领先了，别骄傲");
        }*/

        MyThread2 mt = new MyThread2();
        Thread t = new Thread(mt);
        t.start();
        while (true) {
            System.out.println("兔子领先了，加油");

        }


    }
}
/*方式 1：继承 Java.lang.Thread 类，并覆盖 run() 方法。优势：编写简单；
        劣势：无法继承其它父类*/
class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("乌龟领先了，加油");
        }
    }

}
/*方式 2：实现 Java.lang.Runnable 接口，并实现 run()方法。优势：可继承其
        它类，多线程可共享同一个 Thread 对象；劣势：编程方式稍微复杂，如需访
        问当前线程，需调用 Thread.currentThread()方法*/
class MyThread2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("乌龟超过了，再接再厉");
        }
    }
}
