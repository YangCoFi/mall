package com.yang.mall.thread;

import com.yang.mall.request.Request;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * @ClassName WorkerThread
 * @Description TODO
 * @Author YangC
 * @Date 2021/4/18 15:01
 **/
public class WorkerThread implements Callable<Boolean> {

    private ArrayBlockingQueue<Request> queue;

    public WorkerThread(ArrayBlockingQueue<Request> queue) {
        this.queue = queue;
    }

    @Override
    public Boolean call() throws Exception {
        while (true) {
            break;
        }
        return null;
    }
}
