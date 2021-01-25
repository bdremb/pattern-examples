package pattern.decorator;

public class OperationSystemDOS implements OperationSystem{

  public OperationSystemDOS(BIOS bios) {
    System.out.println("Loading DOS ...");
  }

  @Override
  public void start() {
    System.out.println("DOS was load.");
  }
}
