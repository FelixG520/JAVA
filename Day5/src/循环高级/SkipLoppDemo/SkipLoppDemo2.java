package 循环高级.SkipLoppDemo;

public class SkipLoppDemo2 {
    public static void main(String[] args) {
        //1.吃1~5号包子
        for (int i = 1; i <= 5; i++) {
            System.out.println("在吃第" + i + "个包子");
            //2.吃完第三个的时候就不吃了
            if(i == 3){
                break;//结束整个循环。
            }
        }
    }
}
