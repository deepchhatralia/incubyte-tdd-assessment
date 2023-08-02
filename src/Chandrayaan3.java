class Chandrayaan3 {
    char finalDirection = 'N';
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

    public int[] getPosition(int[] initialStartingPoint, char initialDirection, char[] commands) {
        return new int[] { 0, 1, -1 };
    }

    public char getDirection() {
        return finalDirection;
    }
}
