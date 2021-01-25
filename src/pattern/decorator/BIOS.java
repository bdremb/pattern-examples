package pattern.decorator;

public class BIOS implements OperatingSystem {
  public BIOS(Computer computer) {
    System.out.println("Load BIOS ...");
  }

  public void startSystem() {
    System.out.println("BIOS was load");
  }
}
