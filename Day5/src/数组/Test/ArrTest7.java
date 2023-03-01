package 数组.Test;

import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        //1.定义数组存储1~5
        int[] arr = {1, 2, 3, 4, 5};
        //2.循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着随机索引指向的元素 跟 i 指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //当循环结束之后，那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
