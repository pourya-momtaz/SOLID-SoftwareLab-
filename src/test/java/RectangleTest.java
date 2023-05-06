import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testComputeArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.computeArea());
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.setWidth(6);
        assertEquals(6, rectangle.getWidth());
    }

    @Test
    void testSetHeight() {
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.setHeight(7);
        assertEquals(7, rectangle.getHeight());
    }

}