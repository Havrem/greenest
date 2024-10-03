package greenhouse.hydration.strategy;

@FunctionalInterface
public interface TriFunction {
    double apply(double a, double b, double c); //As it is an interface this will result in runtime polymorphism where the actual method used is determined at runtime.
}
