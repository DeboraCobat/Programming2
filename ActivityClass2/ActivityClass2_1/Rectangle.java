/*Document build by Debora Bastos ID 6213122
 * November 27th, 2022
 */

package ActivityClass2_1;

public class Rectangle {

    private float length, width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return (length + width) * 2;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void valuesCalculation(float length, float width) {
        if (length > 0 && length < 20)
            this.length = length;
        if (width > 0 && width < 20)
            this.width = width;
    }

}
