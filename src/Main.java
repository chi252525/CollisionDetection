import chain.HeroFireDetection;
import chain.HeroHeroDetection;
import chain.HeroWaterDetection;
import chain.Sprite;
import chain.Sprite.PositionComparator;
import chain.Type;
import chain.WaterFireDetection;
import chain.WaterWaterDetection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    List<Sprite> sprites = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      Random random = new Random();
      Sprite sprite = new Sprite();
      sprite.setPosition(random.nextInt(29));
      sprite.setType(Type.getTypeByValue(random.nextInt(3)));
      if (sprite.getType() == Type.HERO) {
        sprite.setHp(30);
      }
      sprites.add(sprite);
    }

    Collections.sort(sprites, new PositionComparator());
    System.out.println("排序後");
    for (int i = 0; i < sprites.size(); i++) {
      System.out.println("C" + (i + 1) + " 位置：" + sprites.get(i).getPosition() + " 類型："
          + sprites.get(i).getType());
    }
    int destination = 20;
    System.out.println(
        "C1 初始位置 :" + sprites.get(0).getType() + sprites.get(0).getPosition() + "目標位置："
            + destination);

    WaterFireDetection waterFireDetection = new WaterFireDetection();
    WaterWaterDetection waterWaterDetection = new WaterWaterDetection();
    HeroFireDetection HeroFireDetection = new HeroFireDetection();
    HeroWaterDetection HeroWaterDetection = new HeroWaterDetection();
    HeroHeroDetection HeroHeroDetection = new HeroHeroDetection();

    waterFireDetection.setNextHandler(waterWaterDetection);
    waterWaterDetection.setNextHandler(HeroFireDetection);
    HeroFireDetection.setNextHandler(HeroWaterDetection);
    HeroWaterDetection.setNextHandler(HeroHeroDetection);

    World world = new World();
    world.setDestination(destination);
    world.setLength(30);
    world.setDetectionHandler(waterFireDetection);
    world.setSprites(sprites);
    world.work();
  }
}