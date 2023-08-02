// import static org.junit.Assert.assertEquals;
// import static ordg.junit.api.Assert.*;

// import org.junit.*;

import org.junit.jupiter.api.*;
// because assertEquals is static method
// import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestChandrayaan3 {
    int initialStartingPoint[] = { 0, 0, 0 };
    char initialDirection;
    char commands[] = { 'f', 'r', 'u', 'b', 'l' };

    Chandrayaan3 obj;

    public TestChandrayaan3() {
        this.initialDirection = 'N';
        this.obj = new Chandrayaan3();
    }

    @Test
    public void move() {
        int temp[] = { 0, 1, 0 };

        assertArrayEquals(temp, obj.move(initialStartingPoint, initialDirection, 'f'));
    }

    @Test
    public void getFinalPosition() {
        int expectedPosition[] = { 0, 1, -1 };
        assertArrayEquals(expectedPosition, obj.getPosition(initialStartingPoint, initialDirection, commands));
    }

    @Disabled
    @Test
    public void getFinalDirection() {
        assertEquals('N', obj.getDirection());
    }

}