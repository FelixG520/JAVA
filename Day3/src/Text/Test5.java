package Text;

public class Test5 {
    public static void main(String[] args){
        //1.定义三个变量记录和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //2.利用三元运算符求出两个数中的较大值。
        int temp = height1 > height2 ? height1 : height2;
        //3.求出最终的结果
        int max = temp > height3 ? temp : height3;
        System.out.println(max);
    }
}
