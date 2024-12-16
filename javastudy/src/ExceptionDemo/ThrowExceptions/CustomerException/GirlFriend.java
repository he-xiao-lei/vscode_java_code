package ExceptionDemo.ThrowExceptions.CustomerException;

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

    public void setName(String name){
        if (name.length() < 3 || name.length() > 10) throw new NameFormatException(name+"长度错误,应在3-10");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) throw new AgeOutOfBoundsException(age+"超出范围,应在18-40");
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge();
    }
}
