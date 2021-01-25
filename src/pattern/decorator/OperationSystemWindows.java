package pattern.decorator;

public class OperationSystemWindows implements OperationSystem {

  public OperationSystemWindows(OperationSystem dos) {
    System.out.println("Loading Windows ...");
  }

  public void startSystem() {
    System.out.println("Windows was load");
  }
}
