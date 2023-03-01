package Text;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        //分析：
        //1.键盘录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int ticket = sc.nextInt();
        if(ticket >= 1 && ticket <= 100){
            //合法
            //2.对票号进行判断
            if (ticket % 2 == 0) {
                //偶数
                System.out.println("坐右边");
            } else {
                //奇数
                System.out.println("坐左边");
            }
        } else{
            //票号不合法
            System.out.println("票号不合法");
        }
    }
}
