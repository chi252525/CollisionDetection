package chain;

import java.util.List;

/*Water 與 Water 的碰撞效果： 移動失敗。
Fire 與 Fire 的碰撞效果： 移動失敗。*/
public class WaterWaterDetection extends DetectionHandler {

  @Override
  public void detect(List<Sprite> sprites, int destination) {
    System.out.println(
        "WaterWaterDetection" + sprites.get(0).getType() + " " + sprites.get(0).getPosition());

    for (Sprite detectee : sprites) {
      if (sprites.get(0).getType() == Type.FIRE && detectee.getType() == Type.FIRE) {
        System.out.println("Fire and Fire detected 移動失敗");
        return;
      }
      if (sprites.get(0).getType() == Type.WATER && detectee.getType() == Type.WATER) {
        System.out.println("Water and Water detected 移動失敗");
        return;
      }
    }
    if (nextHandler != null) {
      nextHandler.detect(sprites, destination);
    }

  }


}
