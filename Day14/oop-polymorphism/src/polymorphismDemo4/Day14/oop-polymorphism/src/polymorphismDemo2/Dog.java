package polymorphismDemo4.Day14.oop;

class Dog extends polymorphismDemo4.Day14.oop.Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog --- show方法");
    }

}