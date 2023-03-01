package 判断和循环.ifDemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine=sc.nextInt();
        if(wine>2){
            System.out.println("小伙子酒量不错！");
        }
    }
}
