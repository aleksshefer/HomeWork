package inheritance;

import inheritance.parts.Engine;
import inheritance.parts.Wheel;

public class Auto implements Driveable {
    private final String name;
    private final double weight;
    private final AutoType autoType;
    private final Engine engine;
    private final Wheel wheel;
    private double kilometersInUse;

    public Auto(String name, double weight, AutoType autoType, Engine engine, double kilometersInUse) {
        this.name = name;
        this.weight = weight;
        this.autoType = autoType;
        this.engine = engine;
        this.wheel = new Wheel();
        this.kilometersInUse = kilometersInUse;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public AutoType getAutoType() {
        return autoType;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public double getKilometersInUse() {
        return kilometersInUse;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", autoType=" + autoType +
                ", engine=" + engine +
                ", wheel=" + wheel +
                ", kilometersInUse=" + kilometersInUse +
                '}';
    }

    @Override
    public void drive(double kilometers) {
        System.out.println(this);

        if (this.engine instanceof Startable) {
            ((Startable) this.engine).startTheEngine(this.name);
        }

        this.wheel.steering();

        System.out.println(this.name + " drove " + kilometers + " kilometers.");

        this.engine.decreaseResource(kilometers);
        this.kilometersInUse += kilometers;

        if (this.engine instanceof Startable) {
            ((Startable) this.engine).turnOffTheEngine(this.name);
        }
    }
}
