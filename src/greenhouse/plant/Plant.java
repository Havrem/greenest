package greenhouse.plant;

import greenhouse.Greenhouse;
import greenhouse.hydration.Instruction;
import java.util.ArrayList;
import java.util.List;

public abstract class Plant implements Hydratable { //Implements an interface
    private final String name; //Encapsulation, the variables are made private and only accessible through public methods which allows greater control for how the objects properties are accessed and manipulated. It also allows for the user to not have to worry about how to do something with the object and instead focus on what can be done.
    private final double length;
    private final List<Instruction> instructions;
    private Greenhouse greenhouse;

    public Plant(String name, double length) {
        this.name = name;
        this.length = length;
        this.instructions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public Greenhouse getGreenhouse() {
        return greenhouse;
    }

    public void setGreenhouse(Greenhouse greenhouse) {
        this.greenhouse = greenhouse;
    }

    public void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
}
