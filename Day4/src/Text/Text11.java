package Text;

import java.util.Scanner;

public class Text11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的选择");
        int choose = sc.nextInt();
        //2.根据选择执行不同的代码
        switch (choose) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;

            /*
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            case 4 ->System.out.println("退出服务");
            default -> System.out.println("退出服务");
            */
        }
    }
}
