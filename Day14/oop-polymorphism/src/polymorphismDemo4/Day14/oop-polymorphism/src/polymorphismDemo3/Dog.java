package polymorphismDemo4.Day14.oop;

class Dog extends polymorphismDemo4.Day14.oop.Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}