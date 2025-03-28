import java.util.List;

public class WaterWaterDetection implements DetectionHandler {

  private DetectionHandler nextHandler;

  @Override
  public DetectionHandler move(List<Sprite> detectees, int moveFrom, int destination) {

    for (Sprite detectee : detectees) {
      if (detectee.getType() == Type.FIRE && detectee.getPosition() == destination) {
        nextHandler.move(detectees, moveFrom, destination);
      }
      if (detectee.getType() == Type.WATER && detectee.getPosition() == destination) {
        nextHandler.move(detectees, moveFrom, destination);
      }
    }
    if (nextHandler != null) {
      nextHandler.move(detectees, moveFrom, destination);
    }
    return null;
  }

  @Override
  public DetectionHandler nextHandler() {
    return new HeroFireDetection();
  }
}
