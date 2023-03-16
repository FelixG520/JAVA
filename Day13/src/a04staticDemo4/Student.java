package a04staticDemo4;

public class Student {
    String name;
    int age;
    static String teacherName;
    //this表示当前方法调用者地址值
    //这个this：是由虚拟机赋值的
    public void show1(Student this){//非静态成员方法 -- show1()
        System.out.println("this:"+this);
        System.out.println(this.name+","+this.age+","+this.teacherName);//有隐藏的this
    }
//    public void show1(){//非静态成员方法 -- show1()
//        System.out.println("this:"+this);
//        System.out.println(name+","+age+","+teacherName);//有隐藏的this
//    }
    public static void method(){ //没有this关键字
        System.out.println("静态方法");
    }
}
