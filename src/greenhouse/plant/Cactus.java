package greenhouse.plant;

import greenhouse.hydration.Instruction;

public class Cactus extends Plant { //Inheritance
    public Cactus(String name, double length) {
        super(name, length);
    }

    @Override
    public void water() {
        for (Instruction instruction : getInstructions()) {
            System.out.println("Fluid: " + instruction.getFluid());
            System.out.println("Amount: " + instruction.getAmount());
        }
    }
}
