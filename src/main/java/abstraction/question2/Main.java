package abstraction.question2;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Animal[] animals = {dog,cat};
        for (Animal animal:animals){
            animal.makeSound();
            animal.sleep();

            if (animal instanceof Dog){
                ((Dog)animal).fetchball();
            }else{
                ((Cat)animal).scratchSofa();
            }
        }


    }
}
