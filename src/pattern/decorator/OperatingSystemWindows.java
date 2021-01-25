package pattern.decorator;

public class OperatingSystemWindows implements OperatingSystem {

  public OperatingSystemWindows(OperatingSystem dos) {
    System.out.println("Loading Windows ...");
  }

  public void startSystem() {
    System.out.println("Windows was load");
  }

  public void shutdownSystem() {
    System.out.println("shutdown operating system");
  }

  public void rebootSystem() {
    System.out.println("Windows was reboot");
  }
}
