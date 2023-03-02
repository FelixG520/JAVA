package Test;

public class Test3 {
    public static void main(String[] args) {
        double area1=getArea(5.3,1.7);
        double area2=getArea(2.4,2.7);
        if(area1>area2){
            System.out.println("第一个正方形更大");
        }else{
            System.out.println("第二个正方形更大");
        }
    }

    public static double getArea(double len,double width) {
        double area=len+width;
        return area;
    }
//    public static void compare(double len1,
//                               double width1,
//                               double len2,
//                               double width2) {
//        double area1=len1+width1;
//        double area2=len2+width2;
//        if(area1>area2){
//            System.out.println("第一个正方形更大");
//        }else{
//            System.out.println("第二个正方形更大");
//        }
}
