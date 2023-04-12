package polymorphismDemo4.Day14.oop;

public class Test {
    public static void main(String[] args) {
        //调用三个对象，并调用register方法
        polymorphismDemo4.Day14.oop.Students s=new polymorphismDemo4.Day14.oop.Students();
        s.setName("zhangsan");
        s.setAge(18);

        polymorphismDemo4.Day14.oop.Teacher t=new polymorphismDemo4.Day14.oop.Teacher();
        t.setName("lisi");
        t.setAge(20);

        polymorphismDemo4.Day14.oop.Administrator admin=new polymorphismDemo4.Day14.oop.Administrator();
        admin.setName("wangwu");
        admin.setAge(30);

        register(s);
        register(t);
        register(admin);
    }

    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void  register(polymorphismDemo4.Day14.oop.Person p){
        p.show();
    }
}
