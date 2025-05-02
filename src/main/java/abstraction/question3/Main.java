package abstraction.question3;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.plugIn();
        washingMachine.turnOn();
        washingMachine.saveEnergy();
    }
}
