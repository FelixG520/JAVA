package MethodDemo;

import java.util.Scanner;

public class MethodDemo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=sc.nextInt();
        System.out.println("请输入第二个数");
        int b=sc.nextInt();
        sum(a,b);
    }

    public static void sum(int a,int b) {
        int c=a+b;
        System.out.println(c);
    }
}
