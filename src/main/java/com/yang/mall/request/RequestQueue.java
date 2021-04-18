package com.yang.mall.request;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassName RequestQueue
 * @Description TODO
 * @Author YangC
 * @Date 2021/4/18 15:05
 **/
public class RequestQueue {
    private List<ArrayBlockingQueue<Request>> queues = new ArrayList<>();

    private static class Singleton {
        private static RequestQueue instance;

        static {
            instance = new RequestQueue();
        }

        public static RequestQueue getInstance() {
            return instance;
        }
    }

    public static RequestQueue getInstance() {
        return Singleton.getInstance();
    }

    public static void init() {
        getInstance();
    }

    public void addQueue(ArrayBlockingQueue<Request> queue) {
        this.queues.add(queue);
    }
}
