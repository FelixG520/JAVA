package Test;

public class Test1 {
    public static void main(String[] args) {
        getLength(5.2,1.3);
    }
    public static void getLength(double len,double width) {
        double L=(len+width)*2;
        System.out.println(L);
    }
}
