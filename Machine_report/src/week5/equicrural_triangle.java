package week5;

import java.util.Scanner;

public class equicrural_triangle {
    public static void main(String[] args) {
        System.out.println("请输入要打印的等腰三角形的层数：");
        Scanner sc=new Scanner(System.in);
        int layer= sc.nextInt();
        //1.使用外部for循环，循环layer轮。外循环循环一次，内循环循环一轮。
        for(int i = 1 ; i <= layer ; i++){
            //2.使用内部for循环，循环layer-1轮，输出空格
            for(int j = 1 ; j <= layer-i ; j++){
                System.out.print(" ");
            }
            //使用内部for循环，循环layer轮，输出*号
            for(int k = 1 ; k <= 2*i-1 ; k++){
                System.out.print("*");
            }
            //当内部两个for循环循环一轮时，通过最后的输出语句实现换行。
            System.out.println();
        }
    }
}