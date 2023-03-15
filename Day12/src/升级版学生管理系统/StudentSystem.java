package 升级版学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    //菜单界面
    public static String menu(){
        System.out.println("--------------欢迎来到学生管理系统---------------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查询学生");
        System.out.println("5.退出");
        System.out.println("请输入您的选择：");
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();//容错率更高
        return choice;
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        Student s = new Student();
        Scanner sc=new Scanner(System.in);
        String id=null;
        while (true) {
            System.out.println("请输入学生的id");
            id=sc.next();
            boolean flag=contains(list,id);
            if(flag){//表示已经存在
                System.out.println("id已经存在！");
            }else {
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name=sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age=sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的地址");
        String address=sc.next();
        s.setAddress(address);
        //把学生加入到集合当中
        list.add(s);
        //提示一下用户
        System.out.println("学生信息添加成功！");
        //queryStudent(list);
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要删除的学生的id");
        String id=sc.next();
        //查询id在集合中的索引
        int index = getIndex(list,id);
        //对index进行判断
        if(index>=0){
            //大于等于0，表示存在，直接删除
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功！");
        }else {
            System.out.println("id不存在，删除失败！");
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        String id =sc.next();
        int index = getIndex(list,id);
        if(index==-1){
            System.out.println("要修改的id"+id+"不存在，请重新输入！");
            return;
        }
        //获取要修改的学生信息
        Student stu=list.get(index);
        System.out.println("请输入要修改的学生姓名");
        String newName=sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生年龄");
        int newAge=sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生家庭住址");
        String newAddress=sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功！");
    }
    public static void queryStudent(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("无当前学生信息，请稍后再添加！");
            //结束方法
            return;
        }
        //打印表头信息
        System.out.println("id\t\t\t\t姓名\t\t年龄\t\t家庭住址");
        //集合中有数据
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+"\t\t\t\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getAddress());
        }
    }
    //判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            Student stu=list.get(i);
//            String sid=stu.getId();
//            if(sid.equals(id)){
//                return true;//存在
//            }
//        }
//        return false;//不存在
        return getIndex(list,id)>=0;
    }
    //通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            //得到每一个学生对象
            Student stu = list.get(i);
            //获取每一个学生对象的ID
            String sid=stu.getId();
            //跟要删除的ID进行比较，如果一样就返回索引
            if(sid.equals(id)){
                return i;
            }
        }
        //不存在
        return -1;
    }
    public static void startStudentSystem() {
        ArrayList<Student> list=new ArrayList<>();
        loop:while (true) {
            String choice=menu();
            switch (choice){
                case "1"-> addStudent(list);
                case "2"-> deleteStudent(list);
                case "3"-> updateStudent(list);
                case "4"-> queryStudent(list);
                case "5"-> {
                    System.out.println("退出！");
                    //break loop;//1.跳出loop循环
                    System.exit(0);//2.停止虚拟机运行
                }
                default -> System.out.println("没有这个选项！");
            }
        }
    }
}
