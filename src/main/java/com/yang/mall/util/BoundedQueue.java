package com.yang.mall.util;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName BoundedQueue
 * @Description TODO
 * @Author YangC
 * @Date 2021/3/13 11:40
 **/
public class BoundedQueue<T> {
    private Object[] items;
    private int addIndex;
    private int removeIndex;
    private int count;
    private Lock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public BoundedQueue(int size) {
        items = new Object[size];
    }

    public void add(T t) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length) {
                notFull.await();
            }
            items[addIndex] = t;
            if (++ addIndex == items.length) {
                addIndex = 0;
            }
            ++ count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    @SuppressWarnings("unchecked")
    public T remove() throws InterruptedException {
        lock.unlock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            Object x = items[removeIndex];
            if (++ removeIndex == items.length) {
                removeIndex = 0;
            }
            -- count;
            notFull.signal();
            return (T) x;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        BoundedQueue<Integer> queue = new BoundedQueue<>(10);

    }
}
