package Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list=new ArrayList<>();
        //2.添加元素
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
