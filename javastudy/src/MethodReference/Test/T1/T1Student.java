package MethodReference.Test.T1;

public class T1Student {
    private String name;
    private int age;

    public T1Student() {
    }
    public T1Student(String str){
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
    }
    public T1Student(String name, int age) {
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

       return "name="+getName()+" age="+getAge();
    }
}
