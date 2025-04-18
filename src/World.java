import chain.DetectionHandler;
import chain.Sprite;
import chain.Type;
import java.util.List;

public class World {

  private int length;
  private DetectionHandler detectionHandler;
  private List<Sprite> sprites;
  private int destination;

  public void work() {
    //    如果 c1 為 Hero， x2 上沒有生命 c1 移動成功。
    if (sprites.get(0).getType() == Type.HERO) {
      for (Sprite sprite : sprites) {
        if ((sprite.getType() == Type.HERO && sprite.getPosition() == destination)) {
          throw new IllegalArgumentException("C1 移動失敗");
        }
      }
      System.out.println("C1 移動成功");
      sprites.get(0).setPosition(destination);
      return;
    }
    detectionHandler.detect(sprites, destination);
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public DetectionHandler getDetectionHandler() {
    return detectionHandler;
  }

  public void setDetectionHandler(DetectionHandler detectionHandler) {
    this.detectionHandler = detectionHandler;
  }

  public List<Sprite> getSprites() {
    return sprites;
  }

  public void setSprites(List<Sprite> sprites) {
    this.sprites = sprites;
  }

  public int getDestination() {
    return destination;
  }

  public void setDestination(int destination) {
    this.destination = destination;
  }


}
