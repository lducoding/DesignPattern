package bridge.smartWatch;

import bridge.strap.Strap;

public class AppleWatch extends SmartWatch{

  public AppleWatch(Strap strap) {
    super(strap);
    System.out.println("애플워치");
  }

  public void appleStrap() {
    strap.wear();
    System.out.println("애플스트랩");
  }

}
