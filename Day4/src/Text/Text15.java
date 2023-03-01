package Text;

import java.util.Scanner;

public class Text15 {
    public static void main(String[] args) {
        //分析:
        //1.键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();
        //2.利用循环获取这个范围中的每一个数字
        // 开始条件: start
        //结束条件: end
        int count=0;
        for (int i = start; i <= end; i++) {
            //3.对每一个数字进行判断，统计有多少个满足要求的数字
            if(i%3==0 && i%5==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("共有"+count+"个数");
    }
}
