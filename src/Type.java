public enum Type {
  HERO(1), WATER(2), FIRE(3);

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
