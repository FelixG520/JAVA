package week6.Address;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入国家：");
        String Country=sc.next();

        System.out.print("请输入所在省份：");
        String Province=sc.next();

        System.out.print("请输入所在城市：");
        String City=sc.next();

        System.out.print("请输入所在街道：");
        String Street=sc.next();

        System.out.print("请输入所在地邮政编码：");
        String Code=sc.next();

        Address ad=new Address(Country,Province,City,Street,Code);
        ad.show();
    }
}
