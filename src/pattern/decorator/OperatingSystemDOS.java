package pattern.decorator;

public class OperatingSystemDOS implements OperatingSystem {

  public OperatingSystemDOS(BIOS bios) {
    System.out.println("Loading DOS ...");
  }

  @Override
  public void startSystem() {
    System.out.println("DOS was load.");
  }

  public void dir() {
    System.out.println("Printing list of directories");
  }
}
