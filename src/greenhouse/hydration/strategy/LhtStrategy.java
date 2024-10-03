package greenhouse.hydration.strategy;

import greenhouse.Greenhouse;
import greenhouse.plant.Plant;

public class LhtStrategy extends FluidStrategy { //Inheritance
    private final TriFunction function;
    private final Plant plant;
    private final Greenhouse greenhouse;

    public LhtStrategy(TriFunction function, Plant plant, Greenhouse greenhouse) {
        this.function = function;
        this.plant = plant;
        this.greenhouse = greenhouse;
    }


    @Override
    public double execute() {
        return function.apply(plant.getLength(), greenhouse.getHumidity(),greenhouse.getTemperature());
    }
}
