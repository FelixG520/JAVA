package polymorphismDemo3;

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}