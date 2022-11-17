package factoryMethod.before;

public class Car {

    public static final String GENESIS = "genesis";
    public static final String SONATA = "SONATA";
    public static final String IONIC = "ionic";

    String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
            "carName='" + carName + '\'' +
            '}';
    }
}
