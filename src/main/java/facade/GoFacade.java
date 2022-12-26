package facade;

public class GoFacade {

  // 시스템을 더욱 편하게 이용하기 위한 높은 수준의 인터페이스 제공
  public static void main(String[] args) {

    TV tv = new TV();
    Radio radio = new Radio();
    Light light = new Light();

    Facade facade = new Facade(tv,radio,light);
    facade.turnOn();
  }
}
