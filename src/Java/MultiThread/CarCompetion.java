package Java.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ciaohi on 2019/10/23 9:36
 */
public class CarCompetion {
    // 参赛赛车的数量
    protected final int totalCarNum = 10;
    // 当前在起跑线的赛车数量
    protected int nowCarNum = 0;
}
class Car implements Runnable{
    private int carNum;
    private CarCompetion competion = null;
    public Car(int carNum, CarCompetion competion) {
        this.carNum = carNum;
        this.competion = competion;
    }
    @Override
    //n辆赛车,在起跑线上就绪后，同时出发
    public void run() {
        synchronized (competion) {
            competion.nowCarNum++;
            while (competion.nowCarNum < competion.totalCarNum) {
                try {
                    competion.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            competion.notifyAll();
        }
        startCar();
    }

    private void startCar() {
        System.out.println("Car num " + this.carNum + " start to run.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Car num " + this.carNum + " get to the finish line.");
    }

    public static void main(String[] args) {
        CarCompetion carCompetion = new CarCompetion();
        final ExecutorService carPool = Executors.newFixedThreadPool(carCompetion.totalCarNum);
        for (int i = 0; i < carCompetion.totalCarNum; i++) {
            carPool.execute(new Car(i, carCompetion));
        }

    }
}
