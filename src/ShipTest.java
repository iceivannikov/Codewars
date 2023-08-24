import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class ShipTest {

    @Test
    void isWorthItFalse() {
        Ship ship = new Ship(20, 35);
        boolean expected = false;
        boolean actual = ship.isWorthIt(ship);
        assertEquals(expected, actual);
    }
    @Test
    void isWorthItTrue() {
        Ship ship = new Ship(60, 5);
        boolean expected = true;
        boolean actual = ship.isWorthIt(ship);
        assertEquals(expected, actual);
    }
}