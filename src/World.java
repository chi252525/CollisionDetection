import java.util.List;

public class World {

  private int length = 30;
  private int destination = 30;
  private int moveFrom = 0;
  private List<Sprite> sprites;

  private DetectionHandler handler;


  public void move(DetectionHandler handler) {
    if (moveFrom >= length || moveFrom <= 0) {
      throw new IllegalArgumentException("超過長度");
    }
    this.handler = handler;
    this.handler.move(sprites, moveFrom, destination);
  }
}
