package polymorphismDemo2;

class Cat extends Animal{
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat --- show方法");
    }
}