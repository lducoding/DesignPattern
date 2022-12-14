package templateMethod.before;

public class TestTemplateMethodBefore {

  public static void main(String[] args) {
    AICar myCar = new AICar();
    myCar.startCar();
    myCar.drive();
    myCar.stop();
    myCar.turnOff();
    System.out.println("*********************");

    ManualCar herCar = new ManualCar();
    herCar.startCar();
    herCar.drive();
    herCar.stop();
    herCar.turnOff();
    System.out.println("*********************");

    HybridCar yourCar = new HybridCar();
    yourCar.startCar();
    yourCar.drive();
    yourCar.stop();
    yourCar.turnOff();
    System.out.println("*********************");
  }
}
