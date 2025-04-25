package Reflections.Demo4;

import java.io.IOException;

public class Demo4Class {
    private String name;
    private int age;
    private String address;

    public Demo4Class() {
    }

    public Demo4Class(String name, int age, String address) {
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
        return "Demo4Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    private String say(String message) throws IOException,ClassCastException,NullPointerException {
        System.out.println("我是方法体");
        return message;
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}

