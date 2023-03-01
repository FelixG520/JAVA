package Text;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        //分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week = sc.nextInt();//3
        //2.利用switch进行匹配
        //----------------------------------------------------
        //利用case穿透简化代码
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
