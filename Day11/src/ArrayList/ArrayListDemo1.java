package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合对象
        //泛型：限定集合中存储数据的类型<E>
        ArrayList<String> list1=new ArrayList<String>();
        //打印对象不是地址值，而是集合中存储数据内容
        ArrayList<String> list2=new ArrayList<>();
        System.out.println(list1);
    }
}
