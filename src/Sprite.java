public class Sprite {

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  private int hp = 0;

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  private int position;

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  private Type type;
}
