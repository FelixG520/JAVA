package Test;

public class Test12 {
    //旋转字符串
    public static String rotate(String str){
        //获取最左边的字符
        char first=str.charAt(0);
        String end=str.substring(1);
        return end+first;
    }

    //判断
    private static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String strA="abcde";
        String strB="cdeab";
        //调用方法进行比较
        boolean check=check(strA,strB);
        System.out.println(check);

    }
}
