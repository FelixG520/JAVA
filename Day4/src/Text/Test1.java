package Text;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        //分析：
        //1.键盘录入一个整数，表示小明的考试名次
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名次");
        int rank = sc.nextInt();
        //2.对小明的考试成绩进行判断即可
        if(rank == 1){
            System.out.println("小红成为了小明的女朋友");
        }
    }
}
