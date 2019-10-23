package Java.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ciaohi on 2019/10/23 10:39
 * 银行账户
 * 100 个线程同时向一个银行账户中存入 1 元钱
 */
public class Account {
    private double balance; // 账户余额
    private Lock accountLock = new ReentrantLock();
    /**
     * 存款
     * @param money 存入金额
     */
    public synchronized void deposit(double money) {
        accountLock.lock();
        try {
            double newBalance = balance + money;
            try {
                Thread.sleep(10); // 模拟此业务需要一段处理时间
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            balance = newBalance;
        }finally {
            accountLock.unlock();
        }
    }
    /**
     * 获得账户余额
     */
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        Account account = new Account();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for(int i = 1; i <= 100; i++) {
            service.execute(new AddMoneyThread(account, 1));
        }
        service.shutdown();
        while(!service.isTerminated()) {
            System.out.println("账户余额: " + account.getBalance());
         }
    }
}
class AddMoneyThread implements Runnable {
    private Account account; // 存入账户
    private double money; // 存入金额
    public AddMoneyThread(Account account, double money) {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        synchronized (account) {
            account.deposit(money);
        }
    }
}



