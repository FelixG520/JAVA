package 数组.Test;

public class ArrTest1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int length= arr.length;
        int count =0;
        for(int i=0;i<length;i++){
            count+=arr[i];
        }
        System.out.println(count);
    }
}
