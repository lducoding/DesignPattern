package templateMethod.after;

public class TestTemplateMethod {

  public static void main(String[] args) {
    Car myCar = new AICar();
    myCar.run();
    System.out.println("*********************");

    Car herCar = new HybridCar();
    herCar.run();
    System.out.println("*********************");

    Car yourCar = new ManualCar();
    yourCar.run();
    System.out.println("*********************");
  }
}
