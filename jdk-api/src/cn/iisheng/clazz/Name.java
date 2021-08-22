package cn.iisheng.clazz;

/**
 * @author iisheng
 * @date 2021/08/22 12:10:08
 */
public class Name {
    static int count = 0;

    static {
        count++;
        System.out.println("Name class loaded! count=" + count);
    }

    public Name() {
        System.out.println("Name Constructor called~");
    }
}
