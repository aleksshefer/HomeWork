package block1.inheritance;

import block1.inheritance.parts.ElectricalEngine;
import block1.inheritance.parts.EngineType;
import block1.inheritance.parts.IceEngine;

public class Main {
    public static void main(String[] args) {
        Driveable[] arrayOfCars = {
                new Auto("rx300", 2000, AutoType.SUV, new IceEngine(EngineType.ONE_MZ), 10000),
                new Auto("rx270", 1800, AutoType.SUV, new IceEngine(EngineType.TWO_MZ), 10300),
                new Auto("wish", 1550, AutoType.WAGON, new IceEngine(EngineType.ONE_ZZ), 55600.2),
                new Auto("tesla", 1700, AutoType.SEDAN, new ElectricalEngine(EngineType.ELECTRICAL), 89000)
        };

        for (Driveable car : arrayOfCars) {
            car.drive(3000);
        }

        for (Driveable car : arrayOfCars) {
            car.drive(100);
        }
    }
}
