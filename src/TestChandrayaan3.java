// import static org.junit.Assert.assertEquals;
// import static ordg.junit.api.Assert.*;

// import org.junit.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestChandrayaan3 {
    int initialStartingPoint[] = { 0, 0, 0 };
    char initialDirection;

    char currDirection[] = { 'W', 'N', 'S', 'E', 'W' };
    int expectedOutput[][] = { { 0, 0, 1 }, { 0, 1, -1 }, { -1, 1, 1 }, { 0, 0, -1 }, { 1, 0, -1 } };
    char[][] commands = { { 'f', 'r', 'l', 'b', 'u', 'f', 'r' }, { 'f', 'r', 'u', 'b', 'l' },
            { 'f', 'l', 'b', 'u', 'f', 'r' }, { 'b', 'u', 'b', 'l', 'f' }, { 'u', 'b', 'l', 'f', 'u' } };
    char finalDirection[] = { 'E', 'W', 'E', 'W', 'U' };

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

    // test single command, returns position
    @Test
    public void getPosition() {
        assertArrayEquals(expectedOutput[1], obj.getPosition(initialStartingPoint, currDirection[1], commands[1]));
    }

    // test all commands from the array, returns position
    @Test
    public void testAllCommands() {
        for (int i = 0; i < commands.length; i++) {
            assertArrayEquals(expectedOutput[i], obj.getPosition(initialStartingPoint,
                    currDirection[i], commands[i]));

            initialStartingPoint[0] = 0;
            initialStartingPoint[1] = 0;
            initialStartingPoint[2] = 0;
        }
    }

    // gets final direction of all commands, returns direction
    @Test
    public void getDirections() {
        for (int i = 0; i < commands.length; i++) {
            assertEquals(finalDirection[i],
                    obj.getDirection(initialStartingPoint, currDirection[i], commands[i]));
        }
    }

}