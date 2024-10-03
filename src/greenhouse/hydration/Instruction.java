package greenhouse.hydration;

import greenhouse.hydration.strategy.FluidStrategy;

public class Instruction {
    private final Fluid fluid;
    private final FluidStrategy fluidStrategy;

    public Instruction(Fluid fluid, FluidStrategy strategy) {
        this.fluid = fluid;
        this.fluidStrategy = strategy;
    }

    public Fluid getFluid() {
        return fluid;
    }

    public Double getAmount() {
        return fluidStrategy.execute();
    }
}
