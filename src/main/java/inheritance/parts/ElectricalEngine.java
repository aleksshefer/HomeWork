package inheritance.parts;

public class ElectricalEngine extends Engine {

    public ElectricalEngine(EngineType engineType) {
        super(engineType);
        this.isStarted = true;
    }
}
