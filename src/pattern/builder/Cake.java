package pattern.builder;

public class Cake {
  private final String egg;
  private final String water;
  private final String flour;
  private final String milk;
  private final String sugar;
  private final String salt;

  public static class Builder {
    private String egg;
    private String water;
    private String flour;
    private String milk;
    private String sugar;
    private String salt;
    private int amount;

    public Builder(int amount) {
      this.amount = amount;
    }

    public Builder egg(int amount) {
      egg = " egg-" + amount;
      return this;
    }

    public Builder water(int amount) {
      water = " water-" + amount;
      return this;
    }

    public Builder flour(int amount) {
      flour = " flour-" + amount;
      return this;
    }

    public Builder milk(int amount) {
      milk = " milk-" + amount;
      return this;
    }

    public Builder sugar(int amount) {
      sugar = " sugar-" + amount;
      return this;
    }

    public Builder salt(int amount) {
      salt = " salt-" + amount;
      return this;
    }

    public Cake build() {
      return new Cake(this);
    }
  }


  public Cake(Builder builder) {
    egg = builder.egg;
    water = builder.water;
    flour = builder.flour;
    milk = builder.milk;
    sugar = builder.sugar;
    salt = builder.salt;
  }

  @Override
  public String toString() {
    return "Cake with {"
        + (egg == null ? " " : egg)
        + (water == null ? " " : water)
        + (flour == null ? " " : flour)
        + (milk == null ? " " : milk)
        + (sugar == null ? " " : sugar)
        + (salt == null ? " " : salt) + '}';
  }
}
