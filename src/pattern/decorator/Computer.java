package pattern.decorator;

public class Computer {

  public static void main(String[] args) {
    BIOS bios = new BIOS();
    bios.startSystem();

    OperationSystem dos = new OperationSystemDOS(bios);
    dos.startSystem();

    OperationSystem windows = new OperationSystemWindows(dos);
    windows.startSystem();

    Application intellijIdea = new IntellijIdeaApp(windows);
    intellijIdea.start();
    System.out.println("----------------------------------------");
    Application update = new IntellijIdeaUpdaterApp(intellijIdea);
    update.start();
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    Application ideaUpdater = new IntellijIdeaUpdaterApp(
        new IntellijIdeaApp(
            new OperationSystemWindows(
                new OperationSystemDOS(new BIOS()))));
    ideaUpdater.start();
  }
}
