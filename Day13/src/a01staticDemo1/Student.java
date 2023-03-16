package a01staticDemo1;


public class Student {
    //属性：姓名、年龄、性别
    private String name;
    private int age;
    private String gender;
    //新增老师的姓名
    //public String teachername;//public,不需要写set和get方法
    public static String teachername;//Student这个类所有的对象都共享同一个老师的姓名


    public Student() {
    }
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study(){
        System.out.println(name+"正在学习！");
    }
    public void show(){
        System.out.println(name+","+age+","+gender+","+teachername);
    }
}
