package inheritance.parts;

import inheritance.Startable;

public class IceEngine extends Engine implements Startable {

    public IceEngine(EngineType engineType) {
        super(engineType);
        this.isStarted = false;
    }

    @Override
    public void startTheEngine(String autoName) {
        this.isStarted = true;
        System.out.println("Engine of " + autoName + " started!");
    }

    @Override
    public void turnOffTheEngine(String autoName) {
        this.isStarted = false;
        System.out.println("Engine " + autoName + "turned off!");
    }
}
