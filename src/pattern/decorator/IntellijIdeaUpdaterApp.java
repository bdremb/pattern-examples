package pattern.decorator;

public class IntellijIdeaUpdaterApp implements Application {

  public IntellijIdeaUpdaterApp(Application application) {
    System.out.println("The IntellijIdea Updater is being updated...");
  }

  @Override
  public void start() {
    System.out.println("IntellijIdea was update");
  }
}
