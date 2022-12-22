package state;

public class SuperLevel extends PlayerLevel{

  @Override
  public void run() {
    System.out.println("광속질주");
  }

  @Override
  public void jump() {
    System.out.println("천장 뚫기");
  }

  @Override
  public void turn() {
    System.out.println("트리플 악셀");
  }

  @Override
  public void showLevelMessage() {
    System.out.println("최강자");
  }
}
