package singleton;

public class TestEarth {
  public static void main(String[] args) {
    Earth earth1 = Earth.getEarth();
    Earth earth2 = Earth.getEarth();
    Earth earth3 = Earth.getEarth();

    System.out.println(earth1.hashCode()
        + "\nearth1=earth2: " + (earth1 == earth2)
        + "\nearth2=earth3: " + (earth2 == earth3));
    System.out.println(earth2.hashCode());
    System.out.println(earth3.hashCode());
  }
}
