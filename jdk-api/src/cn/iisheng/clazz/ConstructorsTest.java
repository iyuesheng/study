package cn.iisheng.clazz;

import java.lang.reflect.Constructor;

/**
 * @author iisheng
 * @date 2021/08/22 12:40:34
 */
public class ConstructorsTest {

    public static void main(String[] args) throws Exception {

        //1.加载Class对象
        Class clazz = Class.forName("cn.iisheng.clazz.Animal");

        //2.获取所有公有构造方法
        System.out.println("所有公有构造方法");
        Constructor[] conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        // 所有的构造方法，公有、私有都行
        System.out.println("");
        System.out.println("所有的构造方法，包括：私有、受保护、默认、公有");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }

        // 获取公有、无参的构造方法
        System.out.println("");
        System.out.println("获取公有、无参的构造方法");
        Constructor con = clazz.getConstructor(null);

        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();

        // 获取私有构造方法
        System.out.println("");
        System.out.println("获取私有构造方法，并调用");
        con = clazz.getDeclaredConstructor(int.class);
        System.out.println(con);
        //暴力访问，忽略掉访问修饰符
        con.setAccessible(true);
        //调用构造方法
        Animal animal = (Animal) con.newInstance(1);
        System.out.println(animal.toString());

    }
}
