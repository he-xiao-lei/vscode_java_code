package MethodReference.Test.T2;

public class T2Student {
    private String name;
    private int age;

    public T2Student() {
    }

    public T2Student(String name, int age) {
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
        return getName()+"-"+getAge();
    }
}
