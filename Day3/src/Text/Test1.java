package Text;
import java.util.Scanner;
//需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
public class Test1 {
    public static void main(String[] args){
        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number=sc.nextInt();
        //2.获取个十百
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
    }
}
