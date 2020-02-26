package cn.iisheng.thread;

import java.util.function.Predicate;

/**
 * @author iisheng
 * @date 2019/11/21 16:16:50
 */
public class ThreadTest {

    public static void main(String[] args) {

        Predicate p;

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ThreadTest.class) {
                }
            }
        }).start();

    }
}
