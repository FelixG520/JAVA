package 判断和循环.SwitchDemo;

public class SwitchDemo2 {
    public static void main(String[] args){
        int number=1;
        switch(number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10或者20");
                break;
        }
    }
}
