package com.yang.mall.thread;

import com.yang.mall.request.Request;
import com.yang.mall.request.RequestQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName RequestProcessorThreadPool
 * @Description TODO
 * @Author YangC
 * @Date 2021/4/18 14:48
 **/
public class RequestProcessorThreadPool {

    private ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public RequestProcessorThreadPool() {

        RequestQueue requestQueue = RequestQueue.getInstance();
        for (int i = 0; i < 10; i ++) {
            ArrayBlockingQueue<Request> queue = new ArrayBlockingQueue(100);
            requestQueue.addQueue(queue);
            threadPool.submit(new WorkerThread(queue));
        }
    }

    private static class Singleton {
        private static RequestProcessorThreadPool instance;

        static {
            instance = new RequestProcessorThreadPool();
        }

        public static RequestProcessorThreadPool getInstance() {
            return instance;
        }
    }

    public static RequestProcessorThreadPool getInstance() {
        return Singleton.getInstance();
    }

    public static void init() {
        getInstance();
    }
}
