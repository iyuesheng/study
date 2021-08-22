package cn.iisheng.clazz;

/**
 * @author iisheng
 * @date 2021/08/22 12:13:53
 */
public class ClazzTest {
    public static void main(String[] args) {
        Class mClass = Name.class;
        System.out.println("mClass = "+mClass);

        Class mClassForName = null;
        try {
            mClassForName = Class.forName("cn.iisheng.clazz.Name");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("mClassForName = "+mClassForName);

        Name name1 = new Name();
        System.out.println("name1 class = " + name1.getClass());

        Name name2 = new Name();
        System.out.println("name2 class = " + name2.getClass());
    }
}
