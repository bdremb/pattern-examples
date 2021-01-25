package pattern.singleton;

public class TestEarth {
  public static void main(String[] args) {
    Earth earth1 = Earth.getEarth();
    Earth earth2 = Earth.getEarth();
    Earth earth3 = Earth.getEarth();

    System.out.println("hashCode earth1 = "+earth1.hashCode()
        + "\nhashCode earth2 = " + earth2.hashCode()
        + "\nhashCode earth3 = " + earth3.hashCode()
        + "\nearth1=earth2: " + (earth1 == earth2)
        + "\nearth2=earth3: " + (earth2 == earth3));
  }
}
