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

    char currDirection[] = { 'W', 'N', 'S' };
    int expectedOutput[][] = { { 0, 0, 1 }, { 0, 1, -1 }, { -1, 1, 1 } };
    char[][] commands = { { 'f', 'r', 'l', 'b', 'u', 'f', 'r' }, { 'f', 'r', 'u', 'b', 'l' },
            { 'f', 'l', 'b', 'u', 'f', 'r' } };

    Chandrayaan3 obj;

    public TestChandrayaan3() {
        this.initialDirection = 'S';
        this.obj = new Chandrayaan3();
    }

    @Test
    public void move() {
        int temp[] = { 0, 1, 0 };

        assertArrayEquals(temp, obj.move(initialStartingPoint, initialDirection, 'f'));
    }

    @Test
    public void getFinalPosition() {
        // int expectedPosition[] = { -1, 1, 1 };
        assertArrayEquals(expectedOutput[1], obj.getPosition(initialStartingPoint, currDirection[1], commands[1]));
    }

    @Test
    public void testAllCommands() {

        for (int i = 0; i < 3; i++) {
            assertArrayEquals(expectedOutput[i], obj.getPosition(initialStartingPoint,
                    currDirection[i], commands[i]));

            initialStartingPoint[0] = 0;
            initialStartingPoint[1] = 0;
            initialStartingPoint[2] = 0;
        }
    }

    @Test
    public void getFinalDirection() {
        assertEquals('N', obj.getDirection());
    }

}