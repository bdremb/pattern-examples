package pattern.singleton;

public class Earth {

  private static volatile Earth earth; // volatile - для исключения кеширования в кеше процессора

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
