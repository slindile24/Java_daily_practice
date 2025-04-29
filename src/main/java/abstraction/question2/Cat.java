package abstraction.question2;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }
    public void scratchSofa(){
        System.out.println("Cat scratches sofa!");
    }
}
