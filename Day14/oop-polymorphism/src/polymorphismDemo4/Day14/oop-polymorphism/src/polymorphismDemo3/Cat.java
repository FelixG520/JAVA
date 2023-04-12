package polymorphismDemo4.Day14.oop;

class Cat extends polymorphismDemo4.Day14.oop.Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}