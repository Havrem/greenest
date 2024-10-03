package greenhouse.hydration.strategy;

import greenhouse.plant.Plant;

import java.util.function.Function;

public class LStrategy extends FluidStrategy { //Inheritance
    private final Function<Double,Double> function; //The Function interface is an example of parametric polymorphism, it can take different kinds of parameters.
    private final Plant plant;

    public LStrategy(Function<Double,Double> function, Plant plant) {
        this.function = function;
        this.plant = plant;
    }

    @Override
    public double execute() {
        return function.apply(plant.getLength());
    }
}
