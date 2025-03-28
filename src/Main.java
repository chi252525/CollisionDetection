import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    int x1 = 10;
    Sprite sprite1 = new Sprite();
    sprite1.setPosition(x1);
    sprite1.setType(Type.HERO);
    List<Sprite> detectees = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      Random random = new Random();
      Sprite sprite = new Sprite();
      sprite.setPosition(random.nextInt(30));
      sprite.setType(Type.getTypeByValue(random.nextInt(3)));
      if (sprite.getType() == Type.HERO) {
        sprite.setHp(30);
      }
      detectees.add(sprite);
    }

    int x2 = 20;

    new World().move(new WaterFireDetection().move(detectees, x1, x2));


  }
}