package 数组.TwoDimensionDemo;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        //一维数组
        int[] arr1=new int[]{};
        //二维数组
        int[][] arr2=new int[][]{{1,2,3},{4,5,6}};
        int[][] arr3={{1,2,3},
                {1,2,3,4,5,6}};
        //获取元素
        System.out.println(arr3[0]);//获取二维数组中的第一个一维数组的地址值
        System.out.println(arr3[0][0]);
        System.out.println(arr3[1][3]);

        //二维数组的遍历
        for (int i = 0; i < arr3.length; i++) {
            //i:表示二维数组中的每一个索引
            for (int j = 0; j < arr3[i].length; j++) {
                //j:表示一维数组中的每一个元素
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
