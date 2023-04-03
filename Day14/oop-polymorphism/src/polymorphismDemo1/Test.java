package polymorphismDemo1;

public class Test {
    public static void main(String[] args) {
        //调用三个对象，并调用register方法
        Students s=new Students();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t=new Teacher();
        t.setName("lisi");
        t.setAge(20);

        Administrator admin=new Administrator();
        admin.setName("wangwu");
        admin.setAge(30);

        register(s);
        register(t);
        register(admin);
    }

    //这个方法既能接收老师，又能接收学生，还能接收管理员
    //只能把参数写成这三个类型的父类
    public static void  register(Person p){
        p.show();
    }
}
