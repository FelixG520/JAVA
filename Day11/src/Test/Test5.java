package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        //键盘录入学生信息，并添加到集合当中
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s=new Student();
            System.out.println("请输学生的姓名");
            String name=sc.next();
            System.out.println("请输学生的年龄");
            int age = sc.nextInt();
            //把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);
            //把学生对象添加到集合
            list.add(s);
        }
        System.out.println(list.size());
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
