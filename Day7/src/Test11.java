import java.util.Random;
import java.util.Scanner;

public class Test11 {
    //判断数字在数组中是否存在
    public static boolean contains(int[] arr,int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
    public static int[] createNumber() {
        //1.创建数组，添加中奖号码
        //6红+1蓝=7
        int arr[]=new int[7];
        //2.随机生成号码添加到数组
        //红球：不能重复1 2 3 4 5 6
        //蓝球：可以和红球号码重复
        Random r=new Random();
        for (int i = 0; i < 6; ) {
            //获取红球号码
           int redNumber = r.nextInt(33)+1;
           boolean flag=contains(arr,redNumber);
           if(!flag){
               //把红球号码添加到数组当中
               arr[i]=redNumber;
               i++;
           }
        }
        //生成蓝球号码并添加到数组当中
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;
        return arr;
    }

    public static int[] userInputNumber() {
        int arr[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber = sc.nextInt();
            //红球不重复
            if(redNumber>=1 && redNumber<=33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    //不存在，可以添加到数组当中
                    arr[i]=redNumber;
                    i++;
                }else {//存在
                    System.out.println("当前红球号码已经存在，请重新输入！");
                }
            }else {
                System.out.println("当前号码超出范围！");
            }
        }
        //用户输入蓝球号码
        System.out.println("请输入蓝球号码：");
        int blueNumber=sc.nextInt();
        while (true) {
            if(blueNumber>=1 && blueNumber<=16){
                arr[arr.length-1]=blueNumber;
                break;
            }else {
                System.out.println("当前蓝球号码超出范围");
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //1.生成中奖号码
        int arr[]=createNumber();
        System.out.println("=======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=======================");
        //2.用户输入彩票号码
        int userInputArr[]=userInputNumber();
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i]+" ");
        }
        System.out.println();
        //3.判断用户的中奖情况
        int redCount=0;
        int blueCount=0;
        //判断红球中奖情况
        for (int i = 0; i < userInputArr.length-1; i++) {
            int redNumber=userInputArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(redNumber == arr[j]){
                    redCount++;
                    //如果找到了，后面的数字就没有必要继续比较
                    break;
                }
            }
        }
        //判断蓝球中奖情况
        int blueNumber=userInputArr[userInputArr.length-1];
        if(blueNumber == arr[arr.length-1]){
            blueCount++;
        }
        //根据红球篮球个数判断中奖情况
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖500万");
        }else if(redCount == 5 && blueCount == 1){
            System.out.println("恭喜你，中奖3000");
        }else if((redCount == 5 && blueCount == 0) ||  (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中奖200");
        }else if((redCount == 4 && blueCount == 0) ||  (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中奖10");
        }else if((redCount == 2 && blueCount == 1) ||  (redCount == 1 && blueCount == 1)|| (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中奖5");
        }else{
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }
}
