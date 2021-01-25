package pattern.strategy;

public class Artist {
  public void draw(String name, Drawable shape) {
    System.out.println(name + " " + shape.draw());
  }
}
