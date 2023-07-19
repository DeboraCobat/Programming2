/*Document build by Debora Bastos ID 6213122
 * November 27th, 2022
 */

package ActivityClass2_1;

public class RectangleTest {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();

    rectangle.valuesCalculation(0, 0);

    System.out.println("Area of Rectangle is "
        + rectangle.getArea());
    System.out.println("Perimeter of Rectangle is "
        + rectangle.getPerimeter());
  }
}