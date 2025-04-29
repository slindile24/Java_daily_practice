package abstraction.question2;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }
    public void fetchball(){
        System.out.println("Dog fetches ball!");
    }
}
