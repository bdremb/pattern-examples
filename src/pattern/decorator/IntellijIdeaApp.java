package pattern.decorator;

public class IntellijIdeaApp implements Application {

  public IntellijIdeaApp(OperationSystem operationSystem) {
    System.out.println("Loading IntellijIdea ...");
  }

  @Override
  public void start() {
    System.out.println("IntellijIdea was load");
  }
}
