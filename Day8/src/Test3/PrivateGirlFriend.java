package Test3;

public class PrivateGirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;
    //针对每一个私有化的成员变量。都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //name
    //作用：给成员变量name进行赋值的
    public void setName(String n){
        name = n;
    }

    //作用：对外提供name属性
    public String getName(){
        return name;
    }

    //age
    public void setAge(int a){
        if(a >= 18 && a<=50){
            age = a;
        }else{
            System.out.println("非法数值");
        }
    }

    public int getAge(){
        return age;
    }

    //gender
    public void setGender(String g){
        gender=g;
    }
    public String getGender(){
        return gender;
    }
    //行为
    public void sleep(){
        System.out.println("女朋友在吃饭！");
    }
    public void eat(){
        System.out.println("女朋友在睡觉！");
    }

}
