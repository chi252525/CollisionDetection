package chain;

import java.util.List;

/*Hero 與 Water 的碰撞效果：
Hero 生命值增加 10 滴。
Water 從世界中被移除。*/
public class HeroWaterDetection extends DetectionHandler {


  @Override
  public void detect(List<Sprite> sprites, int destination) {
    System.out.println("HeroWaterDetection"+ sprites.get(0).getType() + " " + sprites.get(0).getPosition());
    System.out.println(sprites.get(0).getType() + " " + sprites.get(0).getPosition());

    for (Sprite sprite : sprites) {
      if (sprites.get(0).getType() == Type.HERO && sprite.getType() == Type.WATER) {
        sprites.get(0).setHp(sprites.get(0).getHp() + 10);
        sprites.remove(sprite);
        System.out.println(sprite.getType() + " " + sprite.getPosition() + " removed");
        sprites.get(0).setPosition(sprite.getPosition());
        break;
      }
      if (sprites.get(0).getType() == Type.WATER && sprite.getType() == Type.HERO) {
        sprite.setHp(sprite.getHp() + 10);
        sprites.remove(sprites.get(0));
        System.out.println(sprites.get(0).getType() + " " + sprites.get(0).getPosition() + " removed");
        break;
      }
    }
    if (nextHandler != null) {
      nextHandler.detect(sprites, destination);
    }
  }

}
