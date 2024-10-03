package greenhouse.plant;

public interface Hydratable { //Interface.
    void water(); //Polymorphism. All things that are hydratable, like plants, must have a water function, but the implementation varies. Polymorphism in terms of functions/methods means that there are different functions with the same name, and the one picked is determined either at compile time (if using function overloading) or runtime (if using method overriding).
}
