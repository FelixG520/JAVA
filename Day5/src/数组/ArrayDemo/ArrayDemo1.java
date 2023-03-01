package 数组.ArrayDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
    //定义数组存储5个学生的年龄。
    int[] arr1=new int[]{11,22,33,44,55};
    int[] arr2={11,12,13,14};
    int arr[]={11,22,33,4,56};
    //定义数组存储3个学生的姓名。
    String[] namesArr = new String[]{"zhangsan","lisi","wangwu"};
    String[] namesArr2 = {"zhangsan","lisi","wangwu"};
    //定义数组存储4个学生的身高。
    double[] heightsArr = new double[]{1.85,1.82,1.78,1.65};
    double[] heightsArr2 = {1.85,1.82,1.78,1.65};
    System.out.println(heightsArr2);//[D@776ec8df
    }
}
