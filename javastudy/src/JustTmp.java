public class JustTmp {
    public static void main(String[] args) {
        Outer.Inner oni = new Outer.Inner();
        oni.setName("aaa");
        String name = oni.getName();
        System.out.println("name = " +name);
    }
}


class Outer {
    public int age;
    private String name;
    public Outer(){

    }

    public Outer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static class Inner{
        public String name;
        private int anInt;

        public Inner() {
        }

        public Inner(int anInt, String name) {
            this.anInt = anInt;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAnInt() {
            return anInt;
        }

        public void setAnInt(int anInt) {
            this.anInt = anInt;
        }
    }
}
