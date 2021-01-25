package singleton;

public class Earth {

  private static volatile Earth earth;

  private Earth() {
  }

  public static Earth getEarth() {
    if (earth == null) {
      synchronized (Earth.class) {
        if (earth == null) {
          earth = new Earth();
        }
      }
    }
    return earth;
  }
}
