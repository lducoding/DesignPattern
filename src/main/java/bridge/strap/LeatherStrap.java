package bridge.strap;

public class LeatherStrap implements Strap{

  @Override
  public void replaceStrap() {
    System.out.println("가죽 스트랩 교체");
  }

  @Override
  public void wear() {
    System.out.println("가죽 스트랩 착용");
  }

  @Override
  public void unwear() {
    System.out.println("가죽 스트랩 착용해제");
  }
}
