import java.util.List;

public class HeroFireDetection implements DetectionHandler {

  private DetectionHandler nextHandler;

  @Override
  public DetectionHandler move(List<Sprite> detectees,int moveFrom, int destination) {

    for (Sprite detectee : detectees) {
      if (detectee.getType() == Type.HERO && detectee.getPosition() == destination) {

      }
      if (detectee.getType() == Type.FIRE && detectee.getPosition() == destination) {
        detectees.remove(detectee);
      }
    }
    if (nextHandler != null) {
      nextHandler.move( detectees, moveFrom,destination);
    }
    return null;
  }

  @Override
  public DetectionHandler nextHandler() {
    return new HeroWaterDetection();
  }
}
