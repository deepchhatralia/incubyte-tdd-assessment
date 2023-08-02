class Chandrayaan3 {
    char currentDirection;
    int finalPosition[] = new int[3];

    public int[] move(int initialStartingPoint[], char initialDirection, char whichMove) {
        switch (initialDirection) {
            case 'E':
                initialStartingPoint[0] += 1;
                break;
            case 'W':
                initialStartingPoint[0] += 1;
                break;
            case 'N':
                initialStartingPoint[1] += 1;
                break;
            case 'S':
                initialStartingPoint[1] += 1;
                break;
        }
        return initialStartingPoint;
    }

    public void changePosition(int[] initialStartingPoint, char currentDirection, char frontOrBack) {
        // change x (0 index) value
        if (currentDirection == 'E' || currentDirection == 'W') {
            if (frontOrBack == 'f') {
                initialStartingPoint[0] += 1;
            } else {
                initialStartingPoint[0] -= 1;
            }
        }
        // change y (1 index) value
        else if (currentDirection == 'N' || currentDirection == 'S') {
            if (frontOrBack == 'f') {
                initialStartingPoint[1] += 1;
            } else {
                initialStartingPoint[1] -= 1;
            }
        } else if (currentDirection == 'U' || currentDirection == 'D') {
            if (frontOrBack == 'f') {
                initialStartingPoint[2] += 1;
            } else {
                initialStartingPoint[2] -= 1;
            }
        }
    }

    public char changeDirection(int[] initialStartingPoint, char currentDirection, char whichDirection) {
        if (whichDirection == 'r') {
            if (currentDirection == 'E') {
                return 'S';
            } else if (currentDirection == 'W') {
                return 'N';
            } else if (currentDirection == 'N') {
                return 'E';
            } else if (currentDirection == 'S') {
                return 'W';
            } else {
                return 'E';
            }
        } else if (whichDirection == 'l') {
            if (currentDirection == 'E') {
                return 'N';
            } else if (currentDirection == 'W') {
                return 'S';
            } else if (currentDirection == 'N') {
                return 'W';
            } else if (currentDirection == 'S') {
                return 'E';
            } else {
                return 'W';
            }
        } else if (whichDirection == 'u') {
            return 'U';
        } else if (whichDirection == 'd')
            return 'D';

        return currentDirection;
    }

    public int[] getPosition(int[] initialStartingPoint, char initialDirection, char[] commands) {
        this.currentDirection = initialDirection;

        for (int i = 0; i < commands.length; i++) {
            char c = commands[i];

            if (c == 'f' || c == 'b') {
                changePosition(initialStartingPoint, currentDirection, c);
            } else if (c == 'r' || c == 'l' || c == 'u') {
                currentDirection = changeDirection(initialStartingPoint, currentDirection, c);
            }
        }
        return initialStartingPoint;
    }

    public char getDirection(int initialStartingPoint[], char initialDirection, char command[]) {
        for (int i = 0; i < command.length; i++) {
            char c = command[i];

            if (c == 'f' || c == 'b') {
                changePosition(initialStartingPoint, currentDirection, c);
            } else if (c == 'r' || c == 'l' || c == 'u') {
                currentDirection = changeDirection(initialStartingPoint, currentDirection, c);
            }
        }
        return currentDirection;
    }

    public static void main(String[] args) {
        Chandrayaan3 c = new Chandrayaan3();

        int arr[] = c.getPosition(new int[] { 0, 0, 0 }, 'E', new char[] { 'b', 'u', 'b', 'l', 'f' });

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
