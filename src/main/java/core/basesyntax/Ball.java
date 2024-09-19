package core.basesyntax;

public class Ball {
    public static final int MAX_NUMBER = 100;
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "color=" + color.name()
                + ", number=" + number
                + '}';
    }
}
