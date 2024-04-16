package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase()
                + " ball, with number " + number;
    }
}
