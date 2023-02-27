package Text;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args){
        //1.获取两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();
        //2.利用三元运算符求出最终结果
        String result = weight1 == weight2 ? "相同" : "不相同";
        System.out.println(result);
    }
}
