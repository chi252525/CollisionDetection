package chain;

public enum Type {
  HERO(0), WATER(1), FIRE(2);

  public int getValue() {
    return value;
  }

  private int value;

  Type(int i) {
    this.value = i;
  }

  public static Type getTypeByValue(int value) {
    for (Type type : Type.values()) {
      if (type.getValue() == value) {
        return type;
      }
    }
    return null;
  }
}
