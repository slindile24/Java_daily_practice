package abstraction.question4;

public class Developer extends Employee implements BonusEligible{
    @Override
    public void work() {
        System.out.println("Writing code");
    }

    @Override
    public void report(){
        System.out.println("Reporting to manager");
    }

    @Override
    public void receiveBonus(){
        System.out.println("Developer receives bonus.");

    }

}
