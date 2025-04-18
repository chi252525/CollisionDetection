package chain;

import chain.Sprite.PositionComparator;
import java.util.Collections;
import java.util.List;

/*Hero 與 Fire 的碰撞效果：
Hero 生命值減少 10 滴。
Fire 從世界中被移除。*/
public class HeroFireDetection extends DetectionHandler {

  @Override
  public void detect(List<Sprite> sprites, int destination) {
    System.out.println("HeroFireDetection "+ sprites.get(0).getType() + " " + sprites.get(0).getPosition());


    for (Sprite detectee : sprites) {
      if (sprites.get(0).getType()==Type.FIRE &&detectee.getType() == Type.HERO ) {
        sprites.remove(detectee);
        detectee.setHp(detectee.getHp()-10);
      }
      if (sprites.get(0).getType()==Type.HERO && detectee.getType() == Type.FIRE && detectee.getPosition() == destination) {
        sprites.remove(sprites.get(0));
      }
    }
    if (nextHandler != null) {
      nextHandler.detect(sprites, destination);
    }

  }

}
