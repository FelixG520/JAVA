package week5;

import java.util.Random;

public class search {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random number=new Random();
        for(int i=0;i<10;i++){
            arr[i]=number.nextInt(100)+1;//随机生成1-100的10个数
        }
        System.out.print("生成的随机数为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //1）求出所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("\n"+"数组中所有数据的和为:"+sum);
        //2）求所有数据的平均数
        double average=sum/arr.length;
        System.out.println("平均值为："+average);
        //3）统计有多少个数据比平均值大
        int count=0;
        System.out.print("大于平均数的值有：");
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>average){
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n"+"共有"+count+"个元素大于平均值");
    }
}
