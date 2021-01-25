package pattern.decorator;

public class BIOS implements OperationSystem{
  public BIOS(Computer computer) {
    System.out.println("Load BIOS ...");
  }

  public void startSystem() {
    System.out.println("BIOS was load");
  }
}
