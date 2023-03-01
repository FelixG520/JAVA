package 循环高级.SkipLoppDemo;

public class SkipLoppDemo1 {
    public static void main(String[] args) {
        //1.吃1~5号包子
        for (int i = 1; i <= 5; i++) {
            //2.第3个包子有虫子就跳过，继续吃下面的包子
            if (i == 3) {
                //跳过本次循环（本次循环中，下面的代码就不执行了），继续执行下次循环。
                continue;
            }
            System.out.println("在吃第" + i + "个包子");
        }
    }
}
