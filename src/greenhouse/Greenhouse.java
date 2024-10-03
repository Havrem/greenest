package greenhouse;

import greenhouse.hydration.Fluid;
import greenhouse.hydration.strategy.BStrategy;
import greenhouse.hydration.Instruction;
import greenhouse.hydration.strategy.LStrategy;
import greenhouse.plant.Cactus;
import greenhouse.plant.CarnivorousPlant;
import greenhouse.plant.PalmTree;
import greenhouse.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public final class Greenhouse { //Trying to implement some sort of singleton so that the application only accesses one instance of a greenhouse and different classes have access to the same instance.
    private double humidity;
    private double temperature;
    private double sunlight;
    private final List<Plant> plants;

    private static Greenhouse instance;

    private Greenhouse() {
        List<Plant> plants = new ArrayList<>(); //Parametric polymorphism,

        Cactus cactus = new Cactus("Igge", 0.2);
        PalmTree palmTree = new PalmTree("Laura", 5.0);
        CarnivorousPlant carnivorousPlant = new CarnivorousPlant("Meatloaf", 0.7);
        PalmTree palmTree2 = new PalmTree("Olof", 1.0);

        plants.add(cactus);
        plants.add(palmTree);
        plants.add(carnivorousPlant);
        plants.add(palmTree2);

        cactus.addInstruction(new Instruction(Fluid.MINERAL_WATER, new BStrategy(0.02)));
        palmTree.addInstruction(new Instruction(Fluid.TAP_WATER, new LStrategy((l) -> l * 0.5, palmTree)));
        carnivorousPlant.addInstruction(new Instruction(Fluid.PROTEIN_WATER, new LStrategy((l) -> 0.1 + l * 0.2, carnivorousPlant)));
        palmTree2.addInstruction(new Instruction(Fluid.TAP_WATER, new LStrategy((l) -> l * 0.5, palmTree2)));

        this.plants = plants;
    }

    public static Greenhouse getInstance() {
        if (instance == null) {
            instance = new Greenhouse();
        }

        return instance;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getSunlight() {
        return sunlight;
    }

    public void setSunlight(double sunlight) {
        this.sunlight = sunlight;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public Plant findByName(String plantName) {
        return plants.stream().filter(plant -> plant.getName().equals(plantName)).findFirst().orElse(null);
    }

    public void waterByName(String plantName) {
        Plant plant = findByName(plantName);

        if (plant != null) {
            plant.water();
        }
    }
}
