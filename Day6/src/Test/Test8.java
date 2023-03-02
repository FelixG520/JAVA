package Test;

public class Test8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int copyarr[]=copyOfRange(arr,3,7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i]+" ");
        }
    }

    public static int[] copyOfRange(int arr[],int from,int to) {
        //定义新数组
        int index=0;
        int newArr[]=new int[to-from];
        for (int i = from; i < to; i++) {
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
