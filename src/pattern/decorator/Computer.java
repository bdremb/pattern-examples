package pattern.decorator;

public class Computer {

  public static void main(String[] args) {
    Computer computer = new Computer();
    BIOS bios = new BIOS(computer);
    bios.startSystem();

    OperatingSystem dos = new OperatingSystemDOS(bios);
    dos.startSystem();

    OperatingSystem windows = new OperatingSystemWindows(dos);
    windows.startSystem();

    Application intellijIdea = new IntellijIdeaApp(windows);
    intellijIdea.start();
    System.out.println("----------------------------------------");
    Application update = new IntellijIdeaUpdaterApp(intellijIdea);
    update.start();
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    Application ideaUpdater = new IntellijIdeaUpdaterApp(new IntellijIdeaApp(
            new OperatingSystemWindows(new OperatingSystemDOS(new BIOS(new Computer())))));
    ideaUpdater.start();
  }
}
