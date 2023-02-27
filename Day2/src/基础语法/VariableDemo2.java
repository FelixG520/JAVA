public class VariableDemo2 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        //1.基本用法
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        //2.变量参与计算
        System.out.println(a+b);
        //3.修改变量值
        a = 40;
        System.out.println(a);
        //一条语句可以定义多个变量
        int c=100,d=200,e=200;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //变量在使用之前必须要赋值
        int f;
        f=400;
        System.out.println(f);
    }
}


