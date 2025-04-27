package inheritance.question2;



public class Car extends Vehicle{
    String fuelType;

    public Car(String brand,String model,int year,String fuelType){
        super(brand,model,year);
        this.fuelType = fuelType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("fuelType: "+ fuelType);

    }
}
