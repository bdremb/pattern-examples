package pattern.decorator;

public class Computer {

  public static void main(String[] args) {
    BIOS bios = new BIOS();
    bios.start();

    OperationSystem dos = new OperationSystemDOS(bios);
    dos.start();

    OperationSystem windows = new OperationSystemWindows(dos);
    windows.start();

    Application intellijIdea = new IntellijIdeaApp(windows);
    intellijIdea.start();
    System.out.println("----------------------------------------");

    Application ideaUpdater = new IntellijIdeaUpdaterApp(
        new IntellijIdeaApp(
            new OperationSystemWindows(
                new OperationSystemDOS(new BIOS()))));
    ideaUpdater.start();
  }
}
