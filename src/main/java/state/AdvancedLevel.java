package state;

public class AdvancedLevel extends PlayerLevel{

  @Override
  public void run() {
    System.out.println("상급 달리기");
  }

  @Override
  public void jump() {
    System.out.println("이단 점프");
  }

  @Override
  public void turn() {
    System.out.println("상급 턴");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("고수");
  }
}
