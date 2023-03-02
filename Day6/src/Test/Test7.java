package Test;

public class Test7 {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        boolean flag = getExit(arr, 11);
        System.out.print(flag);
    }
    public static boolean getExit(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}