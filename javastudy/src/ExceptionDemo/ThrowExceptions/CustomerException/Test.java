package ExceptionDemo.ThrowExceptions.CustomerException;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        //录入
        Scanner sc = new Scanner(System.in);
        //名字
        //如果try里面的内容有问题就会直接抛出然后被下面的catch接收，然后继续循环，直到所有数据正确，才会执行到break跳出
        while (true) {
            try {
                System.out.print("输入名字");
                String name=sc.nextLine();
                girlFriend.setName(name);
                //年龄
                System.out.print("输入年龄");
                String age = sc.nextLine();
                //可以避免年龄输入非数字
                girlFriend.setAge(Integer.parseInt(age));
                //如果所有数据都是正确的，就会跳出
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
//                System.out.println("数字格式有误");
            }catch (NameFormatException e){
                e.printStackTrace();
//                System.out.println("名字有误");
            }catch (AgeOutOfBoundsException e){
                e.printStackTrace();
//                System.out.println("年龄有误");
            }
        }
        System.out.println(girlFriend);
       }
    }

//    public static String getGirlFriend() throws Exception {
//        Scanner sc = new Scanner(System.in);
//        String name;
//        int age;
//        System.out.print("输入姓名:");
//        name =sc.next();
//        System.out.print("输入年龄:");
//        age = sc.nextInt();
//        if (name.length() < 3 || name.length() > 10 || name.matches("\\w")) throw new Exception("姓名过长或过短");
//        if (age < 18 || age > 40) throw new Exception("年龄过大或过小");
//        return name+age;
//    }

