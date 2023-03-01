package Text;

public class Test17 {
    public static void main(String[] args){
        //1.定义数字
        int x=1234;
        //定义一个临时变量用于记录原来的值做最后的比较
        int temp=x;
        //记录倒过来之后的结果
        int num=0;
        //2.利用循环
        while (x!=0){
            //从右往左获取一位数字
            int ge=x%10;
            //修改x的值
            x/=10;
            //把当前获取的数字拼接到右边
            num=num*10+ge;
        }
        //3.打印num
        System.out.println(num);
        System.out.println(x);
        //4.比较
        System.out.println(num==temp);
    }
}
