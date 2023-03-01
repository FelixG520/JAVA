package 运算操作.ArithmeticoperatorDemo;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args){
        //+
        System.out.println(3+2);
        //-
        System.out.println(3-2);
        //*
        System.out.println(3*2);
        //如果计算时有小数参与，结果有可能不精确
        System.out.println(1.1+1.01);//2.1100000000000003
        System.out.println(1.1-1.01);//0.09000000000000008
        System.out.println(1.1*1.01);//1.1110000000000002
        System.out.println(1.1+1.1);//2.2
    }
}
