package inheritance.parts;

public enum EngineType {
    ONE_MZ("1mz", 3.0, 223.0, 300000, 12),
    ONE_ZZ("1zz", 1.8, 140.0, 180000, 8),
    TWO_MZ("2mz", 2.7, 190, 250000, 10),
    ELECTRICAL("electrical", 0.0, 250.0, 350000, 0);

    private final String engineName;
    private final double engineVolume;
    private final double engineRower;
    private final double engineTotalResource;
    private final double fuelConsumption;

    EngineType(String engineName, double engineVolume, double engineRower,
               double engineTotalResource, double fuelConsumption) {
        this.engineName = engineName;
        this.engineVolume = engineVolume;
        this.engineRower = engineRower;
        this.engineTotalResource = engineTotalResource;
        this.fuelConsumption = fuelConsumption;
    }

    public String getEngineName() {
        return engineName;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getEngineRower() {
        return engineRower;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    public double getEngineTotalResource() {
        return engineTotalResource;
    }
}
