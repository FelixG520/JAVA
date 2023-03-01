package Text;

public class Test16 {
    public static void main(String[] args) {
        //1.定义一个变量表示珠穆朗玛峰的高度
        int height = 8844430;
        //2.定义一个变量表示纸张的厚度
        double paper = 0.1;
        //定义一个计数器（变量），用来统计折叠的次数
        int count = 0;
        //3.循环折叠纸张
        //只有纸张的厚度 < 穆朗玛峰的高度 循环才继续，否则循环就停止
        //坑：只有判断为真，循环才会继续
        while(paper < height){
            //折叠纸张
            paper = paper * 2;
            count++;
        }
        //4.打印一下纸张的厚度
        System.out.println(count);//27
    }
}
