package pattern.builder;

public class Bakery {
  public static void main(String[] args) {
    Cake cake = new Cake.Builder(2, 5)
        .sugar(6)
        .salt(1)
        .build();
    System.out.println(cake);

    Cake cake2 = new Cake.Builder(3, 2)
        .salt(1)
        .milk(2)
        .egg(5)
        .build();
    System.out.println(cake2);
  }
}
