package IO.ObjectStream;

import java.io.Serial;
import java.io.Serializable;


/*
Serializable类是没有抽象方法的，意思是标记型接口
一旦实现了这个接口，那么就表示当前student类对象可以被序列化
理解：
一个物品的合格证
 */
public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 2955674251672985750L;
    private String name;
    private int age;
    //transient：不会将当前属性序列化到本地文件
    private transient String address;
    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
