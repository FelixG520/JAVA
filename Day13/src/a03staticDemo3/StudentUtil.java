package a03staticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};//私有化

    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //定义一个参照物
        int max=list.get(0).getAge();

        //2.循环遍历结合
        for (int i = 1; i < list.size(); i++) {
            int tempAge=list.get(i).getAge();
            if(tempAge>max){
                max=tempAge;
            }
        }
        return max;
    }
}
