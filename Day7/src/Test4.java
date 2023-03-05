import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int cp_Arr[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            cp_Arr[i]=arr[i];
        }
        for (int i = 0; i < cp_Arr.length; i++) {
            System.out.println(cp_Arr[i]);
        }
    }
}
