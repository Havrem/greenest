package greenhouse.hydration.strategy;

import greenhouse.Greenhouse;

public class HtsStrategy extends FluidStrategy { //Inheritance
    private final TriFunction function;
    private final Greenhouse greenhouse;

    public HtsStrategy(TriFunction function, Greenhouse greenhouse) {
        this.function = function;
        this.greenhouse = greenhouse;
    }

    @Override
    public double execute() {
        return function.apply(greenhouse.getHumidity(), greenhouse.getTemperature(), greenhouse.getSunlight());
    }
}
