import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SquareTest {
    @Test
    void testComputeArea() {
        Square square = new Square(4);
        assertEquals(16, square.computeArea());
    }

    @Test
    void testSetSide() {
        Square square = new Square(4);
        square.setSide(6);
        assertEquals(6, square.getSide());
    }
}