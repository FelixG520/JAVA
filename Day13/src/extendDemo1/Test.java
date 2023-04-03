package extendDemo1;

public class Test {
    public static void main(String[] args) {
        //1.创建布偶猫的对象
        dollCat dc=new dollCat();
        dc.drink();
        dc.eat();
        dc.catchMouse();

        //2.创建哈士奇的对象
        Husky h=new Husky();
        h.drink();
        h.eat();
        h.lookHome();
        h.breakHome();
    }
}
