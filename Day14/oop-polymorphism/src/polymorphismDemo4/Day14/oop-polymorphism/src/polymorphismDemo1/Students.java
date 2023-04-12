package polymorphismDemo4.Day14.oop;

public class Students extends polymorphismDemo4.Day14.oop.Person {
    public void show(){
        System.out.println("学生的信息："+getName()+","+getAge());
    }
}
