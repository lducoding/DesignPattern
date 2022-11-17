package factoryMethod;

import factoryMethod.before.Car;
import factoryMethod.refactoring.CarFactory;
import factoryMethod.refactoring.HyundaiFactory;

public class TestFactoryMethod {

    // 팩토리 메서드 사용하기전에는 클라이언트 측에서 처리해야 한다.
    public static void main(String[] args) {
        TestFactoryMethod testFactoryMethod = new TestFactoryMethod();
        Car car = testFactoryMethod.produceCar("ionic");
        System.out.println(car.toString());
    }


    public Car produceCar(String carName) {
        // 팩토리 메서드 패턴을 사용하기전
//        Car car = null;
//
//        if(carName.equalsIgnoreCase(Car.GENESIS)) {
//            car =  new Car("genesis");
//        } else if(carName.equalsIgnoreCase(Car.SONATA)) {
//            car =  new Car("sonata");
//        } else if(carName.equalsIgnoreCase(Car.IONIC)) {
//            car =  new Car("ionic");
//        }

        CarFactory carFactory = new HyundaiFactory();
        Car car = carFactory.produceCar(carName);

        return car;
    }

}
