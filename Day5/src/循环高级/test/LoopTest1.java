package 循环高级.test;

public class LoopTest1 {
    public static void main(String[] args) {
        //1.得到1~100之间的每一个数字//开始: 1
        //结束: 100
        for (int i = 1; i <= 100; i++) {
            //2.判断每一个数字，如果符合规则，就打印过，如果不符合规则就打印真实的数字
            if(i % 10 == 7 || i / 10 % 10 == 7 || i%7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
