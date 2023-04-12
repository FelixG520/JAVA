package polymorphismDemo4.Day14.oop;

class Cat extends polymorphismDemo4.Day14.oop.Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat --- show方法");
    }
}