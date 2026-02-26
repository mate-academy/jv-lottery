package core.basesyntax;

public class Ball {
    private final int number;
    private final Color color;

    public Ball(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return color.name()
                + " ball with number "
                + number
                + "!";
    }
}
