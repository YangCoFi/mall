package com.yang.mall.concurrent;
import java.util.concurrent.Semaphore;

/**
 * @ClassName SemaphoneTest
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/18 16:08
 **/
public class SemaphoneTest {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(2, true);
        new Thread(() -> {
            try {
                s.acquire();
                System.out.println("T1 is running...");
                Thread.sleep(200);
                System.out.println("T1 is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                s.release();
            }
        }).start();

        new Thread(() -> {
            try {
                s.acquire();
                System.out.println("T2 is running...");
                Thread.sleep(200);
                System.out.println("T2 is running...");
                s.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
