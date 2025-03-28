import java.util.List;

public class HeroHeroDetection implements DetectionHandler {

  private DetectionHandler nextHandler;

  @Override
  public DetectionHandler move( List<Sprite> detectees,int moveFrom, int destination) {

    return null;
  }

  @Override
  public DetectionHandler nextHandler() {
    return null;
  }
}
