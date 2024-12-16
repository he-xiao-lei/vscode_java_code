package ExceptionDemo;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String str) {
        this.name = str.split("-")[0];
        this.age = Integer.parseInt(str.split("-")[1]);
    }

    public Student(String name, int age) {
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
        if (age < 18 || age > 40) {
            //平时,不推荐
//            System.out.println("超出范围");
            throw new RuntimeException("超出范围");
        }
        this.age = age;
    }
}
