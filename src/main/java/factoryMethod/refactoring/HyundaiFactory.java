package factoryMethod.refactoring;

import factoryMethod.before.Car;

public class HyundaiFactory implements CarFactory{

    @Override
    public Car produceCar(String carName) {
        Car car = null;

        if(carName.equalsIgnoreCase(Car.GENESIS)) {
            car =  new Genesis("genesis");
        } else if(carName.equalsIgnoreCase(Car.SONATA)) {
            car =  new Sonata("sonata");
        } else if(carName.equalsIgnoreCase(Car.IONIC)) {
            car =  new Ionic("ionic");
        }

        return car;
    }
}
