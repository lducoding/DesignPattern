package state;

public class BeginnerLevel extends PlayerLevel {

  @Override
  public void run() {
    System.out.println("초보자 뛰기");
  }

  @Override
  public void jump() {
    System.out.println("초보자 점프");
  }

  @Override
  public void turn() {
    System.out.println("초보자 턴");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("허접");
  }
}
