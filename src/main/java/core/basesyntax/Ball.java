package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(Colors color, int number) {
        this.color = color.name();
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball:  "
                + "color='" + color + '\''
                + ", number=" + number
                + "\n";
    }
}
