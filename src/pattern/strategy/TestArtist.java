package pattern.strategy;

public class TestArtist {
  public static void main(String[] args) {
    Artist artist = new Artist();

    System.out.println(" <Drawing circle>");
    artist.draw("Ivan", new CircleStrategy());
    artist.draw("Peter", new CircleStrategy());

    System.out.println(" <Drawing square>");
    artist.draw("Svetlana", new SquareStrategy());
    artist.draw("Peter", new SquareStrategy());

    System.out.println(" <Drawing triangle>");
    artist.draw("Ivan", new TriangleStrategy());
    artist.draw("Svetlana", new TriangleStrategy());
    artist.draw("Peter", new TriangleStrategy());
  }
}
