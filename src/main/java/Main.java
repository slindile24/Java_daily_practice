public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Migos", "Pitbull", 3);

        System.out.println("Dog Name: " + myDog.getName());
        System.out.println("Breed: " + myDog.getBreed());
        System.out.println("Age: " + myDog.getAge());

        myDog.bark();
    }
}
