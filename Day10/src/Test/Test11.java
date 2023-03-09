package Test;

import javax.swing.text.Style;
import java.util.Scanner;

public class Test11 {
    //判断数字合法性
    public static boolean checkstr(String str){
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c<'0' || c>'9'){
                return false;
            }
        }
        return true;
    }
    //查表法
    public static String changeRome(int num){
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[num];
    }

    public static void main(String[] args) {
        //字符串输入，并判断合法性
        Scanner sc=new Scanner(System.in);
        String str;
        while (true){
            System.out.println("请输入一段数字字符串");
            str=sc.next();
            boolean flag=checkstr(str);
            if(flag){
                break;
            }else {
                System.out.println("不符合规则，请重新输入");
                continue;
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            //将字符数字‘0’—‘9’转化为数字0—9
            int num=c-'0';//char类型存放的是ASCII码值，因此要减掉48或‘0’
            String s=changeRome(num);
            sb.append(s);
        }
        System.out.println(sb);

    }
}
