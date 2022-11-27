package bridge;

import bridge.smartWatch.AppleWatch;
import bridge.smartWatch.GalaxyWatch;
import bridge.smartWatch.SmartWatch;
import bridge.strap.LeatherStrap;
import bridge.strap.MetalStrap;

public class WatchTest {

  public static void main(String[] args) {
    AppleWatch appleWatch = new AppleWatch(new MetalStrap());
    SmartWatch galaxyWatch = new GalaxyWatch(new LeatherStrap());

    appleWatch.replace();
    galaxyWatch.unwear();
  }

}
