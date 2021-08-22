package cn.iisheng.clazz;

import cn.iisheng.serializable.Person;

import java.lang.reflect.Field;

/**
 * @author iisheng
 * @date 2021/08/22 12:48:09
 */
public class FieldGeTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("aaa");
        person.setAge(12);

        Class clazz = Person.class;
        // 获取类中声明的字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // 避免 can not access a member of class com.java.test.Person with modifiers "private"
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ":"+ field.get(person));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
