import java.util.Random;
public class Test3 {
    public static void main(String[] args) {
        char arr[]=new char[52];
        for (int i = 0; i < arr.length; i++) {
            if(i<26){
                arr[i]=(char) ((97+i));//a
            }else {
                arr[i]=(char) (65+i-26);//A
            }
            //System.out.println(arr[i]);
        }
        Random num=new Random();
        String result=" ";
        for (int i = 0; i < 4; i++) {//随机生成字母
            int index=num.nextInt(arr.length);
            result+=arr[index];
        }
        //随机生成数字
        int number=num.nextInt(10);
        result+=number;
        System.out.println(result);

    }
}
