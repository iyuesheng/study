package cn.iisheng.serializable;

import java.io.*;

/**
 * @author iisheng
 * @date 2019/12/12 20:57:33
 */
public class Person  implements Externalizable {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("non-arg constructor");
    }

    public Person(String name, Integer age) {
        System.out.println("arg constructor");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "[" + name + ",age " + age + "]";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
