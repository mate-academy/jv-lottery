package core.basesyntax;

public class Ball {

    private static int counter = 1;
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball №" + counter++ + ":" + "\n" + "color: " + color + "\n" + "number: " + number;
    }
}
