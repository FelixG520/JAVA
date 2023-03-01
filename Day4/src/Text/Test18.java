package Text;

public class Test18 {
    public static void main(String[] args) {
        //1.定义变量记录被除数
        int dividend = 10;
        //2.定义变量记录除数
        int divisor = 3;
        //定义一个变量用来统计相减了多少次
        int count=0;
        //3.循环 while
        //在循环中，不断的用被除数 - 除数
        //只要被除数 是大于等于除数的，那么就一直循环
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        //当循环结束之后dividend变量记录的就是余数
        System.out.println(dividend);
        System.out.println("共减了"+count+"次");
    }
}
