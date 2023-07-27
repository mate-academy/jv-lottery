package core.basesyntax;

public class Ball {
    private final Color color;
    private final int number;
    private static int counter = 1;

    @Override
    public String toString() {
        return "Ball №" + counter++ + ":" + "\n" + "color: " + color + "\n" + "number: " + number;
    }

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
}
