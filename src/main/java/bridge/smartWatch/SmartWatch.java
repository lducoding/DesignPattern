package bridge.smartWatch;

import bridge.strap.Strap;

public class SmartWatch {
  Strap strap;

  public SmartWatch(Strap strap) {
    this.strap = strap;
  }

  public void wear() {
    strap.wear();
  }

  public void replace() {
    strap.replaceStrap();
  }

  public void unwear() {
    strap.unwear();
  }
}
