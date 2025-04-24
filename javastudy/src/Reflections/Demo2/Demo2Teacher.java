package Reflections.Demo2;


public class Demo2Teacher {
    private String name;
    private int age;

    public Demo2Teacher() {
    }

    private Demo2Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected Demo2Teacher(String name){
        this.name = name;
    }
    private Demo2Teacher(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo2Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
