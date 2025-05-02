package abstraction.question3;

public class WashingMachine extends Appliance implements EnergySaver{
    @Override
    void turnOn() {
        System.out.println("Machine turning on!");
    }

    @Override
    public void saveEnergy(){
        System.out.println("Machine is using power-saving mode.");

    }

}
