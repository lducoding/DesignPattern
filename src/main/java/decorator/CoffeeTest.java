package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;

public class CoffeeTest {

  public static void main(String[] args) {
    Coffee kenyaCoffee = new KenyaAmericano();
    kenyaCoffee.brewing();

    Coffee latte = new Latte(new EtiopiaAmericano());
    latte.brewing();

    Coffee mocha = new Mocha(latte);
    mocha.brewing();

    // java.io 패키지에 InputStream 은 Coffee 와 같은 추상클래스
    // FileInputStream 이 Decorator 클래스
  }
}
