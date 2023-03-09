package StringBuilderDemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();//默认产生长度16的数组
        System.out.println(sb.capacity());//容量 -- 16
        System.out.println(sb.length());//长度，啥都没装 -- 0

        sb.append("abc");
        System.out.println(sb.capacity());//容量 -- 16
        System.out.println(sb.length());//已有的元素个数 -- 3

        sb.append("abcdefghijklmnopqistuvwxyz");
        System.out.println(sb.capacity());//扩容 -- 16*2+2=34
        System.out.println(sb.length());//已有的元素个数 -- 29

        sb.append("abcdefghijklmnopqistuvwxyz12345678910");//以实际长度为准创建数组大小
        System.out.println(sb.capacity());//扩容 -- 37
        System.out.println(sb.length());//已有的元素个数 -- 37
    }

}
