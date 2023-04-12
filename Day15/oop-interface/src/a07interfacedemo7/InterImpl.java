package a07interfacedemo7;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    //不叫重写 -- 静态方法不能被重写，只是刚好有重名方法而已
    public static void show() {
        System.out.println("InterImpl重写的抽象方法");
    }

}
