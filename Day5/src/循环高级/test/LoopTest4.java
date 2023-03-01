package 循环高级.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        //创建对象
        Random r = new Random();
        //1.生成一个1-100之间的随机数
        int random = r.nextInt(100) + 1;//0~99
        //2.使用键盘录入去猜出这个数字是多少？
        Scanner sc = new Scanner(System.in);
        while (true) {
            //输入要猜测的数
            System.out.println("请输入要猜测的数字");
            int gussnumber = sc.nextInt();
            //3.判断
            if (gussnumber > random) {
                System.out.println("大了");
            } else if (gussnumber < random) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了！");
                break;
            }
        }
    }
}
