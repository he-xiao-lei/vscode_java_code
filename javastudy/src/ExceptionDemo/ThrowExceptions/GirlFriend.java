package ExceptionDemo.ThrowExceptions;

public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException {
        if (name.length() < 3 || name.length() > 10) throw new RuntimeException("输入名称错误");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) throw new RuntimeException();
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}
