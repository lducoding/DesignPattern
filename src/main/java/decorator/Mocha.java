package decorator;

public class Mocha extends Decorator{

  public Mocha(Coffee coffee) {
    super(coffee);
  }

  @Override
  public void brewing() {
    super.brewing();
    System.out.println("모카를 추가한다.");
  }
}
