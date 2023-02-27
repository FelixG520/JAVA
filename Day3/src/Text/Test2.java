package Text;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        /*您和您的约会对象正试图在餐厅获得一张桌子.
        键盘录入两个整数，表示你和你约会对象衣服的时璧度。
        (手动录入9~19之间的整数，不能录其他)
        如果你的时髻程度大于你对象的时壁程度，相亲就成功，输出true。否则输出false。*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入我们自己的衣服时度");
        int myfasion=sc.nextInt();
        System.out.println("请输入相亲对象的衣服时度");
        int girlfasion=sc.nextInt();
        boolean result=myfasion>girlfasion;
        System.out.println(result);
    }
}
