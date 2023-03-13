package Test;

import java.util.ArrayList;

public class Test6 {
    public static boolean contains(ArrayList<User> list, String id){
        //循环遍历集合，得到集合里面的每一个元素
        //再进行判断
        for (int i = 0; i < list.size(); i++) {
            //i 索引  list.get(i); 元素
            User u = list.get(i);
            //判断id是否存在，我是拿着谁跟谁比较
            //需要把用户对象里面的id拿出来再进行比较。
            String uid = u.getId();
            if(id.equals(uid)){
                return true;//return 关键字：作用就是结束方法。
            }
        }
        //只有当集合里面所有的元素全部比较完毕才能认为是不存在的。
        return false;
    }
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list=new ArrayList<>();
        //2.创建对象
        User u1 = new User("heima001","zhangsan","123456");
        User u2 = new User("heima002","lisi","12345678");
        User u3 = new User("heima003","wangwu","1234qwer");
        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean flag=contains(list,"heima001");
        System.out.println(flag);
    }
}
