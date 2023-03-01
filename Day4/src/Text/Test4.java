package Text;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        //分析:
        //1.键盘录入一个整数表示用户实际支付的钱.
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个整数表示实际支付的钱");
        int money = sc.nextInt();
        //2.判断
        if(money >= 600) {
            System.out.println("付款成功");
        }
        else {
            System.out.println("付款失败");
        }
    }
}
