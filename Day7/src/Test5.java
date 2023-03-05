import java.util.Scanner;

public class Test5 {
    //1.获取分数
    public static int[] getscore() {
        //定义分数数组
        int scores[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入第"+(i+1)+"个评委的得分");
            int score=sc.nextInt();
            if(score>0&&score<=100){
                scores[i]=score;
                i++;
            }else {
                System.out.println("成绩超出了范围,继续录入，当前的i为：" + i);
            }
        }
        return scores;
    }
    //2.获取最大值
    public static int getmax(int arr[]) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //3.获取最小值
    public static int getmin(int arr[]) {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static int getsum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        //1.获取评委分数
        int scores[]=getscore();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]+" ");
        }
        //2.找出分数最大值
        int max=getmax(scores);
        //3.找出最小值
        int min=getmin(scores);
        //4.分数求和
        int sum=getsum(scores);
        //5.去掉最值计算平均值
        int average=(sum-max-min)/4;
        System.out.println("选手最终得分为："+average);
    }
}
