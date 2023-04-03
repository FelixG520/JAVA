package polymorphismDemo1;

public class Administrator extends Person{
    public void show(){
        System.out.println("管理员的信息："+getName()+","+getAge());

    }
}
