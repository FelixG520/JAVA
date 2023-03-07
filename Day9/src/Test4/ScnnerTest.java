package Test4;

import java.util.Scanner;

public class ScnnerTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("请输入一个整数：");//123 456
        System.out.println(num);//123
        System.out.println("请输入第二个整数：");
        int num2= sc.nextInt();//456
        System.out.println(num2);

        System.out.println("请输入一个字符串：");
        String str1 = sc.next();//abc def
        System.out.println(str1);//abc
        System.out.println("请输入第二个字符串：");
        String str2 = sc.next();//def
        System.out.println(str2);

        System.out.println("请输入一个字符串：");
        String line1 = sc.nextLine();//abc def
        System.out.println(str1);//abc def
        System.out.println("请输入第二个字符串：");
        String line2 = sc.nextLine();
        System.out.println(str2);

        //键盘录入的两套体系不能混用的
        System.out.println("请输入一个整数");
        int Num = sc.nextInt();//123 789
        System.out.println(Num);//123
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();// 789
        System.out.println(line);
    }
}
