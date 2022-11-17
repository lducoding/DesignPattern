package factoryMethod.refactoring;


import factoryMethod.before.Car;

public interface CarFactory {

    Car produceCar(String carName);

}
