package chain;

import chain.Sprite.PositionComparator;
import java.util.Collections;
import java.util.List;

/*Water 與 Fire 的碰撞效果：
Water 從世界中被移除。
Fire 從世界中被移除。*/
public class WaterFireDetection extends DetectionHandler {


  @Override
  public void detect(List<Sprite> sprites, int destination) {
    System.out.println("WaterFireDetection"+ sprites.get(0).getType() + " " + sprites.get(0).getPosition());
    for (Sprite detectee : sprites) {
      if (detectee.getType() == Type.FIRE && detectee.getPosition() == destination) {
        sprites.remove(detectee);
      }
      if (detectee.getType() == Type.WATER && detectee.getPosition() == destination) {
        sprites.remove(detectee);
      }
    }
    if (nextHandler != null) {
      nextHandler.detect(sprites, destination);
    }
  }


}
