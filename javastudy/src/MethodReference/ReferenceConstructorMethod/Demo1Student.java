package MethodReference.ReferenceConstructorMethod;

public class Demo1Student {
    private String name;
    private int age;

    public Demo1Student() {
    }
    //str表示流里面的每一个字符
    public Demo1Student(String str){
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
    }
    public Demo1Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return getName()+":"+getAge();
    }
}
