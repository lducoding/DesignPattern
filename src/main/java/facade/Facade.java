package facade;

public class Facade {
  private TV tv;
  private Radio radio;
  private Light light;

  public Facade(TV tv, Radio radio, Light light) {
    this.tv = tv;
    this.radio = radio;
    this.light = light;
  }

  public void turnOn() {
    tv.turnOn();
    radio.turnOn();
    light.turnOn();
  }
}
