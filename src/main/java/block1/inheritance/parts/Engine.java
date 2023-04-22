package block1.inheritance.parts;

public abstract class Engine {
    private final EngineType engineType;
    private double engineResource;
    protected boolean isStarted;

    public Engine(EngineType engineType) {
        this.engineType = engineType;
        this.engineResource = engineType.getEngineTotalResource();
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void decreaseResource(double resourceInKilometers) {
        this.engineResource -= resourceInKilometers;
    }

    public double getEngineResourceInPercent() {
        return (100 - this.engineResource / engineType.getEngineTotalResource() * 100);
    }

    public double getEngineResourceInKilometers() {
        return this.engineResource;
    }

    @Override
    public String toString() {
        return this.engineType.getEngineName();
    }
}
