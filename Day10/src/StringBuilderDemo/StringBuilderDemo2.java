package StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb=new StringBuilder();

        //2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        System.out.println(sb);

        //3.转成string类型
        String str=sb.toString();
        System.out.println(str);
    }

}
