package polymorphismDemo1;

public class Students extends Person {
    public void show(){
        System.out.println("学生的信息："+getName()+","+getAge());
    }
}
