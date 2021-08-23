package cn.iisheng.synchronizedlock;

/**
 * @author iisheng
 * @date 2021/08/22 13:10:07
 */
public class SynchronizedDemo {
    public void method() {
        synchronized (this) {
            System.out.println("Method 1 start");
        }
    }
}
