package Test3;

import Test3.PrivateGirlFriend;

public class PrivateGirlfriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        PrivateGirlFriend gf1=new PrivateGirlFriend();
        //赋值
        gf1.setName("王铁锤");
        gf1.setAge(-18);
        gf1.setGender("女");

        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());

        gf1.eat();
        gf1.sleep();


    }
}
