package decorator;

public class CoffeeTest {

  public static void main(String[] args) {
    Coffee kenyaCoffee = new KenyaAmericano();
    kenyaCoffee.brewing();

    Coffee latte = new Latte(new EtiopiaAmericano());
    latte.brewing();

    Coffee mocha = new Mocha(latte);
    mocha.brewing();
  }
}
