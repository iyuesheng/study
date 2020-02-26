package cn.iisheng.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author iisheng
 * @date 2019/12/12 20:55:40
 */
public class SerializableTest {


    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
             ObjectInputStream ios = new ObjectInputStream(new FileInputStream("person.txt"))) {
            //第一次序列化person
            Person person = new Person("哈哈哈哈哈哈", 23);
            oos.writeObject(person);
            System.out.println(person);

            Person p1 = (Person) ios.readObject();
            System.out.println("从文件中拿的：" + p1.getName());

            //修改name
            person.setName("海贼王");
            System.out.println(person);
            //第二次序列化person
            oos.writeObject(person);

            Person p2 = (Person) ios.readObject();
            System.out.println("第二次  从文件中拿的：" + p2.getName());

            //依次反序列化出p1、p2
//            Person p1 = (Person) ios.readObject();
//            Person p2 = (Person) ios.readObject();
            System.out.println(p1 == p2);
            System.out.println(p1.getName().equals(p2.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("person.txt");
//
//        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
//        Person person = new Person("xxxx", 15);
//        oout.writeObject(person);
//        oout.close();
//
//        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
//        Object newPerson = oin.readObject();
//        oin.close();
//        System.out.println(newPerson);
//    }
}
