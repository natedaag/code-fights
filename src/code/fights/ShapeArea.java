package code.fights;

public class ShapeArea {

  public static void main(String[] args) {
    shapeArea(4);
  }

  static int shapeArea(int n) {
    int area = (n * n) + ((n - 1) * (n - 1));
    System.out.print(area);
    return area;
  }
}
