package cn.iisheng.clazz;

/**
 * @author iisheng
 * @date 2021/08/22 12:39:32
 */
public class Animal {

    /**
     * 动物名字
     */
    public String name;

    /**
     * 动物年龄
     */
    protected int age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 默认的构造方法
     *
     * @param name
     */
    Animal(String name) {
        System.out.println("执行了" + "默认的构造方法 " + name);
    }

    /**
     * 无参构造方法
     */
    public Animal() {
        System.out.println("执行了" + "无参构造方法 ");
    }

    /**
     * 有一个参数的构造方法
     *
     * @param name
     */
    public Animal(char name) {
        System.out.println("执行了" + "有一个参数的构造方法 name:" + name);

    }

    /**
     * 有多个参数的构造方法
     *
     * @param name
     * @param age
     */
    public Animal(String name, int age) {
        System.out.println("执行了" + "有多个参数的构造方法 name:" + name + "age:" + age);
    }

    /**
     * protected的构造方法
     *
     * @param n
     */
    protected Animal(boolean n) {
        System.out.println("执行了" + "受保护的构造方法 n:" + n);
    }

    /**
     * 私有构造方法
     *
     * @param age
     */
    private Animal(int age) {
        System.out.println("执行了" + "私有构造方法 age:" + age);
        this.name = "私有构造方法调用成功";
        this.age = age;
    }


    /**
     * 公有方法
     *
     * @param s
     */
    public void public1(String s) {
        System.out.println("调用了" + "公有的方法" + "： public1 , s:" + s);
    }

    /**
     * protected的方法
     */
    protected void protected2() {
        System.out.println("调用了" + "protected的方法" + "： protected2 ");
    }

    /**
     * 友好的方法
     */
    void friendly1() {
        System.out.println("调用了" + "友好的方法" + "： friendly1 ");
    }

    /**
     * 私有方法
     *
     * @param age
     * @return
     */
    private String private1(int age) {
        System.out.println("调用了" + "私有方法" + "： private1 ，age：" + age);
        return age + "";
    }


}
