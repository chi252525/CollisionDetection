package chain;

import java.util.List;

//Hero 與 Hero 的碰撞效果： 移動失敗。
public class HeroHeroDetection extends DetectionHandler {


  @Override
  public void detect(List<Sprite> sprites, int destination) {
    System.out.println(
        "HeroHeroDetection" + sprites.get(0).getType() + " " + sprites.get(0).getPosition());

    for (Sprite detectee : sprites) {
      if (sprites.get(0).getType() == Type.HERO && detectee.getType() == Type.HERO) {
        System.out.println("Hero and Hero detected 移動失敗");
        return;
      }
    }
    if (nextHandler != null) {
      nextHandler.detect(sprites, destination);
    }
  }

}
