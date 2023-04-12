package polymorphismDemo4.Day14.oop;

public class Test {
    public static void main(String[] args) {
        //创建对象
        polymorphismDemo4.Day14.oop.Animal a = new polymorphismDemo4.Day14.oop.Dog();
        //编译看左边，运行看右边
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //a.lookHome();
        /*
        报错的原因？
        当调用成员方法的时候，编译看左边，运行看右边
        那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错。
        解决方案：
        变回子类类型就可以了
        */
        polymorphismDemo4.Day14.oop.Dog D=(polymorphismDemo4.Day14.oop.Dog) a;
        /*
        细节：转换的时候不能瞎转，如果转成其他类的类型，就会报错
        Cat c = (Cat) a;
        c.catchMouse();
        */

//        if(a instanceof Dog){ //a是不是Dog -- instanceof
//            Dog d = (Dog) a;
//            d.lookHome();
//        }else if(a instanceof Cat){
//            Cat c = (Cat) a;
//            c.catchMouse();
//        }else{
//            System.out.println("没有这个类型，无法转换");
//        }

        //新特性
        //先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为d
        //如果不是，则不强转，结果直接是false
        if(a instanceof polymorphismDemo4.Day14.oop.Dog d){
            d.lookHome();
        }else if(a instanceof polymorphismDemo4.Day14.oop.Cat c){
            c.catchMouse();
        }else{
            System.out.println("没有这个类型，无法转换");
        }
    }
}
