package greenhouse.hydration.strategy;

public class BStrategy extends FluidStrategy { //Inheritance
    double amount;

    public BStrategy(double amount) {
        this.amount = amount;
    }

    @Override
    public double execute() {
        return amount;
    }
}
