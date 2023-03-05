package Test1;

import Test1.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象
        Phone p=new Phone();
        p.brand="华为";
        p.price=5999.98;

        //获取手机对象的值
        System.out.println(p.brand);
        System.out.println(p.price);
        //调用手机中的方法
        p.call();
        p.playgame();

        Phone p2=new Phone();
        p2.brand="苹果";
        p2.price=8999;

        p2.call();
        p2.playgame();
    }
}
