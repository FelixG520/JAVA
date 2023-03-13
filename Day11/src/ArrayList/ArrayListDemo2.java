package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        //1.添加
        boolean result = list.add("aaa");
        System.out.println(result); //true -- 添加成功返回true
        System.out.println(list);   //[aaa]
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //2.删除
        //根据内容删除
        boolean result2=list.remove("aaa");
        System.out.println(result2);//true -- 删除成功
        System.out.println(list);
        boolean result_2=list.remove("eee");
        System.out.println(result_2);//false -- 删除失败
        //根据索引删除
        String str = list.remove(0);
        System.out.println(str);//返回被删除的元素

        //3.修改
        String str2 = list.set(1,"ddd");//1索引变成ddd
        System.out.println(str2);
        System.out.println(list);

        //4.查询
        String s= list.get(0);
        System.out.println(s);
        System.out.println(list);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 以此表示索引
            String ss = list.get(i);
            System.out.println(ss);
        }
    }
}
