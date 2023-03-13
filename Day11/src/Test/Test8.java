package Test;

import java.util.ArrayList;

public class Test8 {
    public static ArrayList<Phone> getPrice(ArrayList<Phone> list){
        ArrayList<Phone> resultList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p=list.get(i);
            int price=p.getPrice();
            if(price<3000){
                resultList.add(p);
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        //2.创建手机对象
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);

        //3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4.调用方法
        ArrayList<Phone> phoneInfoList=getPrice(list);
        for (int i = 0; i < list.size(); i++) {
            Phone phone=phoneInfoList.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }
    }
}
