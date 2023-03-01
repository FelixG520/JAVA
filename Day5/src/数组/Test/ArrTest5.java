package 数组.Test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random number=new Random();
        for(int i=0;i<10;i++){
            arr[i]=number.nextInt(100)+1;
        }
        //1）求出所有数据的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("数组中所有数据的和为"+sum);
        //2）求所有数据的平均数
        double average=sum/arr.length;
        System.out.println(average);
        //3）统计有多少个数据比平均值小
        int count=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<sum){
                count++;
            }
        }
        System.out.println("共有"+count+"个元素小于平均值");
    }
}
