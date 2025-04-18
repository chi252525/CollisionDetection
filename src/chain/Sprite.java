package chain;

import java.util.Comparator;

public class Sprite {

  private int hp = 0;
  private int position;
  private Type type;


  public static class PositionComparator implements Comparator<Sprite> {
    @Override
    public int compare(Sprite sprite1, Sprite sprite2) {
      return Integer.compare(sprite1.getPosition(), sprite2.getPosition());
    }
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }
}