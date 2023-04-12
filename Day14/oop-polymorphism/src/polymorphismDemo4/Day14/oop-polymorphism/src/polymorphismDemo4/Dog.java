package polymorphismDemo4.Day14.oop;

public class Dog extends polymorphismDemo4.Day14.oop.Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookhome(){
        System.out.println("狗再看家");
    }
}
