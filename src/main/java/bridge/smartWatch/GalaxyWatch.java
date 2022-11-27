package bridge.smartWatch;

import bridge.strap.Strap;

public class GalaxyWatch extends SmartWatch{

  public GalaxyWatch(Strap strap) {
    super(strap);
    System.out.println("갤럭시워치");
  }

  public void galaxyStrap() {
    strap.wear();
    System.out.println("갤럭시스트랩");
  }

}
