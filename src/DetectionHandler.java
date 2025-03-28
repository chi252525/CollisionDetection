import java.util.List;

public interface DetectionHandler {

  DetectionHandler move(List<Sprite> detectees, int moveFrom,int destination);

  DetectionHandler nextHandler();
}
