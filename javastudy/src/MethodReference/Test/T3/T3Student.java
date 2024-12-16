package MethodReference.Test.T3;

public class T3Student {
    private String name;
    private int age;

    public T3Student() {
    }

    public T3Student(String name, int age) {
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
