package 数组.Test;

public class ArrTest3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){//偶数
                arr[i]*=0.5;
            }else{
                arr[i]*=2;
            }
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
