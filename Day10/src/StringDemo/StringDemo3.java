package StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.输入abc
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str=sc.next(); //next()用的new方法
        //2.再定义一个abc
        String str2 = "abc";
        //3.用==比较
        System.out.println(str==str2);//false
    }
}
